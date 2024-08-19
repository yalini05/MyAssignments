package homeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------Fibonacci Series-----");
		int a=0;
		int b=1;
		for (int i = 0; i< 8; i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			
			}

	}

}
