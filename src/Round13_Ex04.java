class Upp{
	int x;
	int y;
	public Upp(){
		x=10;
		y=20;
	}
	
	public Upp(int x){
		this();
		this.x=x;
	}
	public Upp(int x,int y){
		this(x);
		this.y=y;
	}
}
class Loww extends Upp{
	int  r;
	public Loww(){
		super();
		r=30;
	}
	public Loww(int x){
		super(x);
		r=30;
	}
	public Loww(int x,int y){
		super(x,y);
		r=30;
	}
	
	public Loww(int x,int y, int r){
		super(x,y);
		this.r=r;
	}
	
	public void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(r);
	}
}



public class Round13_Ex04 {

	public static void main(String ar[]){
		Loww L0=new Loww();
		Loww L1=new Loww(1);
		Loww L2=new Loww(2,3);
		Loww L3=new Loww(4,5,6);
		
		L0.disp();
		System.out.println();
		L1.disp();
		System.out.println();
		L2.disp();
		System.out.println();
		L3.disp();
	}
	
	
}
