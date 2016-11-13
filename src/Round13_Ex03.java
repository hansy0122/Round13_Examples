class UP{
	int x=100;
	public void disp(){
		System.out.println(x);
	}
	
}
class LOW extends UP{
	int y=300;
	public void disp(){
		System.out.println(this.y);
		System.out.println(super.x);
	}
	
}
public class Round13_Ex03 {
	public static void main(String ar[]){
		LOW l=new LOW();
		l.disp();
		l.x=100;
		l.y=100;   // °Á ÀÚ±â²¨Ã³·³ »ç¿ë°¡´É.
	}
}
