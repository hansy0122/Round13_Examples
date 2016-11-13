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
		System.out.printf("점(x,y)=(%d,%d)",this.x,this.y);
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
		System.out.println("반지름 r="+this.r);
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
		System.out.println("폭 ="+this.w+","+"높이 ="+this.h);
	}
}
public class Round13_Ex06 {
	public static void main(String ar[]) throws IOException{
		MyPoint mp[]=new MyPoint[10];
		for(int i=0;i<mp.length;i++){
			System.out.println();
			System.out.print("1.원 2.사각형 3.보기 4.종료 ==>");
			int x=System.in.read()-48;
						System.in.read();
						System.in.read();  // 이런거 처리안해 주면 에러남
			if(x==1){
				mp[i]= new Circle();
			}
			else if(x==2){
				mp[i]=new Rect();
			}
			else if(x==3){
				System.out.println();
				System.out.println("=== 보기 ===");
				for(int a=0;a<i;a++){
					mp[a].disp();
				}
				System.out.println("=== 보기 ===");
				System.out.println();
				i--;
			}
			else if(x==4){
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
			
		}
		System.out.println();
		System.out.println("수고하셨습니다.");
	}

}
