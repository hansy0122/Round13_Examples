class M{
	
	
}

class N extends M{
	
}
public class Round13_Ex10 {
	public static void main(String ar[]){
		M mp=new N();
		N np=null;
		
		if(mp instanceof N){
			np=(N)mp;
			System.out.println("�� ��ȯ ����");
		}
		else{
			System.out.println("�� ��ȯ �Ұ���");
		}
	}
}
