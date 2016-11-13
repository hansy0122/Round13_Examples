package RN;
class A{
	private int x;
	private int y;
	A(){
		x=1;y=1;
	}
	A(int x){
		this();
		this.x=x;
	}
	A(int x,int y){
		this(x);
		this.y=y;
	}
	public void disp(){
		System.out.println(x);
		System.out.println(y);
	}
	
}
class B extends A{
	private int x;
	private int y;
	
	B(){
		super();
		x=1;y=1;
	};
	B(int x){
		super(x);
		this.x=1;this.y=1;
	};
	B(int x ,int y){
		super(x,y);
		this.x=1;this.y=1;
	};
	
	B(int x,int y,int nx){
		this(x,y);
		this.x=nx;
	};
	B(int x,int y,int nx, int ny){
		this(x,y,nx);
		this.y=ny;
	};
	
	public void disp(){
		super.disp();
		System.out.println(x);
		System.out.println(y);
	}
	
}



public class Round13_Ex11 {

	public static void main(String ar[]){
		B bp=new B();
		B bp1=new B(10);
		B bp2=new B(10,20);
		B bp3=new B(10,20,30);
		B bp4=new B(10,20,30,40);
		
		bp.disp();
		System.out.println();
		bp1.disp();
		System.out.println();
		bp2.disp();System.out.println();
		bp3.disp();System.out.println();
		bp4.disp();System.out.println();
		
		
	}
}
