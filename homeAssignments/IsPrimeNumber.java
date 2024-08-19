package homeAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		int b=0;
		for (int i = 2; i <= a-1; i++)
		{
			if(a%i==0) 
			{
				b++;
				
			}
		}
		if (b>0)
		{
			System.out.println("It is not prime number");
		}else
		{
			System.out.println("It is prime number");
		}
		
	}

}
