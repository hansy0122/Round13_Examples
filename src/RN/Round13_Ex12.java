package RN;

import java.io.*;

class Base{  //�̸� �ֹ�
	private String name;
	private String s_jumin;
	private int jumin[]=new int[14];
	private boolean check;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		//�Է�
		public String getName1() throws IOException{
			System.out.print("�̸�=");
			name=in.readLine();
			return name;
		}
		public String getName() throws IOException{
			
			return name;
		}
		public String getJumin1()throws IOException{
			do {
				check = false;
				System.out.print("�ֹι�ȣ = ");
				s_jumin = in.readLine();

				int[] jumin = new int[14];
				for (int i = 0; i < jumin.length; ++i) {
					jumin[i] = s_jumin.charAt(i) - 48; // �ű�
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
					System.out.println("�ֹι�ȣ�� Ʋ���ϴ�.");
					check = true;
				}
			} while (check);
			return s_jumin;
		}
		public String getJumin()throws IOException{

			return s_jumin;
		}

}
		
		

class SungJuk extends Base{ //����
	private int sub[];
	private String subn[];
	private float avg;
	private char grade;
	
	SungJuk()throws IOException{
		sub=new int[5];
		subn=new String[]{"����","����","����"};
		getName1();
		getJumin1();
		inpp();
		cal();
	}
	
	//�Է�
	public void inpp()throws IOException{
		System.out.println("������ �Է��ϼ���");
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
	//�������
	
	
	//���
	public void disp(){
		for(int i=0;i<3;i++){
		System.out.println(subn[i]+"�� ������"+sub[i]);
		}
		System.out.println("�Ѿ�"+sub[3]);
		System.out.println("�� ���"+sub[4]);
		System.out.println("���"+avg);
		System.out.println("������"+grade);
	}
	
}

class PersonInfo extends Base{ //Ű ������ �÷�
	private double h;
	private double w;
	private double e;
	
	PersonInfo(String name, String s_jumin) throws IOException{
		System.out.println("Ű=");
		h=Double.parseDouble(in.readLine());
		System.out.println("������=");
		w=Double.parseDouble(in.readLine());
		System.out.println("�÷�=");
		e=Double.parseDouble(in.readLine());
	}
	public void disp(){
		System.out.println("Ű="+h);
		System.out.println("������="+w);
		System.out.println("�÷�="+e);
	}
	
}

public class Round13_Ex12 {
	public static void main(String ar[])throws IOException{
		SungJuk sj=new SungJuk();
		PersonInfo pi=new PersonInfo(sj.getName(),sj.getJumin()); //�����ڰ� �̸��� �ֹ����� �����Բ�.
				sj.disp(); //����ó�����
				pi.disp(); //�⺻ ����
		
		
	}
}
