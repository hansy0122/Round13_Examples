import java.io.*;

class Base {
	private String name;
	private String s_jumin;
	protected static BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public void set_data() throws IOException {
		System.out.print("이름 = ");
		name = in.readLine();
		boolean check = false;
		do {
			check = false;
			System.out.print("주민번호 = ");
			s_jumin = in.readLine();

			int[] jumin = new int[14];
			for (int i = 0; i < jumin.length; ++i) {
				jumin[i] = s_jumin.charAt(i) - 48;
			}

			int hap = 0;
			float temp = 0;
			float temp1 = 0;
			int cre = 2;
			for (int i = 0; i < jumin.length - 1; ++i) {
				if (i == 6) continue;
				hap += jumin[i] * cre++;
				if (cre == 10)
					cre = 2;
			}
			temp = (int) (hap / 11.0f) * 11.0f + 11.0f - hap;
			temp1 = temp - (int) (temp / 10.0f) * 10.0f;
			if (temp1 != jumin[13]) {
				System.out.println("주민번호가 틀립니다.");
				check = true;
			}
		} while (check);
	}
	
	public String getName() { return name; }
	public String getJumin() { return s_jumin; }
	public void setName(String name) {
		this.name = name;
	}
	public void setJumin(String jumin) {
		this.s_jumin = jumin;
	}
	
	public void disp() {
		System.out.println(name + "님! ~");		
	}
}

class Sungjuk extends Base {
	private String[] sub = new String[] { "국어", "영어", "수학" };
	private int[] subject = new int[sub.length + 2];
	private float avg;
	private char hak;

	public Sungjuk() throws IOException {
		super.set_data();
		for (int i = 0; i < sub.length; ++i) {
			System.out.print(sub[i] + " = ");
			subject[i] = Integer.parseInt(in.readLine());
			subject[sub.length] += subject[i];
		}
		subject[sub.length + 1] = 1; // 등수 1등으로 무조건 설정
		avg = subject[sub.length] / (float) sub.length;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:	hak = 'A';	break;
		case 8:	hak = 'B';	break;
		case 7:	hak = 'C';	break;
		case 6:	hak = 'D';	break;
		default:hak = 'F';	break;
		}
	}

	public void disp() {
		super.disp();
		System.out.println();
		System.out.println("총점 : " + subject[sub.length] + "점");
		System.out.printf("평균 : %.2f점\n", avg);
		System.out.println("학점 : " + hak + "학점");
		System.out.println("석차 : " + subject[sub.length + 1] + "등");
		System.out.println();
	}
}

class MyPersonInfo extends Base {
	private float height;
	private float weight;
	private float sight;
	public MyPersonInfo(String name, String jumin) throws IOException {
		setName(name);
		setJumin(jumin);
		System.out.print("키 = ");
		height = Float.parseFloat(in.readLine());
		System.out.print("몸무게 = ");
		weight = Float.parseFloat(in.readLine());
		System.out.print("시력 = ");
		sight = Float.parseFloat(in.readLine());
	}
	public void disp() {
		System.out.println();
		System.out.println("키 = " + height + "cm");
		System.out.println("몸무게 = " + weight + "kg");
		System.out.println("시력 = " + sight);
		System.out.println();
	}
}

public class Manager {
	public static void main(String[] ar) throws IOException {
		Sungjuk sj = new Sungjuk();
		MyPersonInfo pi = new MyPersonInfo(sj.getName(), sj.getJumin());
		System.out.println();
		System.out.println();
		sj.disp();
		pi.disp();
	}
}
