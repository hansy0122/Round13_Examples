import java.io.*;
class MyPoint{
	private int x;
	private int y;
	protected static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	protected MyPoint() throws IOException{
		System.out.print("x=");
		this.x=Integer.parseInt(in.readLine());
		System.out.print("y=");
		this.y=Integer.parseInt(in.readLine());
	}
	
	protected void disp(){
		System.out.println();
		System.out.printf("��(x,y)=(%d,%d)",this.x,this.y);
	}
}

class Circle extends MyPoint{
	private int r;
	public Circle() throws IOException{
		super();
		System.out.print("r=");
		this.r=Integer.parseInt(in.readLine());
	}
	public void disp(){
		super.disp();
		System.out.println("������ r="+this.r);
	}
}	

class Rect extends MyPoint {
	private int w;
	private int h;
	public Rect()throws IOException{
		super();
		System.out.print("w=");
		this.w=Integer.parseInt(in.readLine());
		System.out.print("h=");
		this.h=Integer.parseInt(in.readLine());
	}
	public void disp(){
		super.disp();
		System.out.println("�� ="+this.w+","+"���� ="+this.h);
	}
}
public class Round13_Ex06 {
	public static void main(String ar[]) throws IOException{
		MyPoint mp[]=new MyPoint[10];
		for(int i=0;i<mp.length;i++){
			System.out.println();
			System.out.print("1.�� 2.�簢�� 3.���� 4.���� ==>");
			int x=System.in.read()-48;
						System.in.read();
						System.in.read();  // �̷��� ó������ �ָ� ������
			if(x==1){
				mp[i]= new Circle();
			}
			else if(x==2){
				mp[i]=new Rect();
			}
			else if(x==3){
				System.out.println();
				System.out.println("=== ���� ===");
				for(int a=0;a<i;a++){
					mp[a].disp();
				}
				System.out.println("=== ���� ===");
				System.out.println();
				i--;
			}
			else if(x==4){
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		
			
		}
		System.out.println();
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
