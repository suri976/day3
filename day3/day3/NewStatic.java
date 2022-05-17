package day3;



public class NewStatic {
	static int x;
	 static String y;
	 int p=5;
	 static void m()
	{
		
		System.out.println(y);
		System.out.println(x);
	}
	 NewStatic()
	 {
		 
	 }
	public NewStatic(int p) {
		super();
		this.p = p;
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		NewStatic.x = x;
	}
	public static String getY() {
		return y;
	}
	public static void setY(String y) {
		NewStatic.y = y;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "NewStatic [p=" + p + ", getP()=" + getP() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 

}
