package day3;





public class S2 {

	public static void main(String[] args) {
		System.out.println(NewStatic.y);
		System.out.println(NewStatic.x);
		NewStatic.setX(600);
		NewStatic.setY("tencent");
		System.out.println(NewStatic.y);
		System.out.println(NewStatic.x);
		
		int p=NewStatic.getX();
		System.out.println(p);
		NewStatic.setX(200);
		System.out.println(NewStatic.x);
		NewStatic obj=new NewStatic();
		System.out.println(obj);
		System.out.println(obj.p);
		
		// TODO Auto-generated method stub

	}

}