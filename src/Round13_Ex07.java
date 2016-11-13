class A3{
	public String toString(){
		return "A3 클래스";
	}
}

class B3{
	public String toString(){
		return "B3 클래스";
	}
}
public class Round13_Ex07 {
	public static void main(String ar[]){
		A3 ap=new A3();
		B3 bp=new B3();
		
		System.out.println(ap);
		System.out.println(bp);
		
		
		
		Object obj[]=new Object[2];
		obj[0]=new A3();
		obj[1]=new B3();
		for(int a=0;a<obj.length;a++){
			System.out.println("obj["+a+"]="+obj[a]);   // 이런식의 배열화가 매우 큰 장점.
		}
		
		
	}
}
