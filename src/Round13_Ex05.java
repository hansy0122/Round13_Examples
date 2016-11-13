class A1{
	protected int x=100;
}
class B1 extends A1{
	private int x =200;
	public  void disp(){
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

public class Round13_Ex05 {
	public static void main(String ar[]){
		B1 bp =new B1();
		bp.disp();
		
	}

}
