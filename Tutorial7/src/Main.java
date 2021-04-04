
public class Main {
	
	public static int factorial(int number) {
		if(number ==1)
			return 1;
		else
			return number * factorial(number-1);
			
	}
	public static int fibonacci(int number) {
		if(number==1)
			return 1;
		else if(number==2)
			return 1;
		else
			return fibonacci(number-1)+fibonacci(number-2);
		
	}
	public static void main(String[] args) {
		System.out.println("10팩토리얼은 "+ factorial(10));
		
		System.out.println("피보나치수열의 10번째 원소는 "+fibonacci(10));

	}

}
