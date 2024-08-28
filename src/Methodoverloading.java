
public class Methodoverloading{

	public class Main{
		static int findSum(int a,int b) {
			return a+b;
		}
		static int findSum(int x,int y,int z) {
		return x+y+z;
		
	}
	static double findSum(double c,double d) {
		return c+d;
	}
	public static void main(String[] args) {
		int Sum1=findSum(a:10,b:20);
		int Sum2=findSum(x:5,y:10,z:20);
		double Sum3=findSum(c:3.5,d:5.5);
		System.out.println(Sum1);
		System.out.println(Sum2);
		System.out.println(Sum3);


	}

}
}
