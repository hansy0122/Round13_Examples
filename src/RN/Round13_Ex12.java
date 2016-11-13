package RN;

import java.io.*;

class Base{  //이름 주번
	private String name;
	private String s_jumin;
	private int jumin[]=new int[14];
	private boolean check;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		//입력
		public String getName1() throws IOException{
			System.out.print("이름=");
			name=in.readLine();
			return name;
		}
		public String getName() throws IOException{
			
			return name;
		}
		public String getJumin1()throws IOException{
			do {
				check = false;
				System.out.print("주민번호 = ");
				s_jumin = in.readLine();

				int[] jumin = new int[14];
				for (int i = 0; i < jumin.length; ++i) {
					jumin[i] = s_jumin.charAt(i) - 48; // 신기
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
			return s_jumin;
		}
		public String getJumin()throws IOException{

			return s_jumin;
		}

}
		
		

class SungJuk extends Base{ //성적
	private int sub[];
	private String subn[];
	private float avg;
	private char grade;
	
	SungJuk()throws IOException{
		sub=new int[5];
		subn=new String[]{"국어","영어","수학"};
		getName1();
		getJumin1();
		inpp();
		cal();
	}
	
	//입력
	public void inpp()throws IOException{
		System.out.println("성적을 입력하세요");
		for(int i=0;i<3;i++){
			System.out.println(subn[i]);
			sub[i]=Integer.parseInt(in.readLine());
			sub[3]+=sub[i];
			
		}
		sub[4]=1;
			
		
	}
	public void cal(){
		 avg=sub[3]/3;
		
		switch((int)avg/10) {
	
		case(10):case(9): grade='A';break;
		case(8):grade='B';break;
		case(7):grade='C';break;
		default:grade='F';break;
		}
		
	}
	//학점계산
	
	
	//출력
	public void disp(){
		for(int i=0;i<3;i++){
		System.out.println(subn[i]+"의 점수는"+sub[i]);
		}
		System.out.println("총업"+sub[3]);
		System.out.println("반 등수"+sub[4]);
		System.out.println("평균"+avg);
		System.out.println("학점은"+grade);
	}
	
}

class PersonInfo extends Base{ //키 몸무게 시력
	private double h;
	private double w;
	private double e;
	
	PersonInfo(String name, String s_jumin) throws IOException{
		System.out.println("키=");
		h=Double.parseDouble(in.readLine());
		System.out.println("몸무게=");
		w=Double.parseDouble(in.readLine());
		System.out.println("시력=");
		e=Double.parseDouble(in.readLine());
	}
	public void disp(){
		System.out.println("키="+h);
		System.out.println("몸무게="+w);
		System.out.println("시력="+e);
	}
	
}

public class Round13_Ex12 {
	public static void main(String ar[])throws IOException{
		SungJuk sj=new SungJuk();
		PersonInfo pi=new PersonInfo(sj.getName(),sj.getJumin()); //생성자가 이름과 주민으로 열리게끔.
				sj.disp(); //성적처리결과
				pi.disp(); //기본 정보
		
		
	}
}
