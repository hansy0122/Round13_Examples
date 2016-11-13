class A4{
	int x=100;
	public void aaa(){
		System.out.println("aaa");
	}

public void bbb(){
	System.out.println("aaa");
}
}

class B4 extends A4{
	int x=300;
	int y=200;
	
	public void bbb(){
		System.out.println("bbb");
	}
	public void ccc(){
		System.out.println("ccc");
	}
}
public class Round13_Ex08 {
	public static void main(String ar[]){
		A4 ap=new B4();
		
		System.out.println(ap.x);
		//System.out.println(ap.y);
		ap.aaa();
		ap.bbb();
		//ap.ccc();
		
	}
}
