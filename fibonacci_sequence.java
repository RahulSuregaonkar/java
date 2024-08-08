package Practice;

public class fibonacci_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2);
		for (int i=1;i<=10;i++) {
			fib3=fib1+fib2;
			System.out.print(" "+fib2);
			fib1=fib2;
			fib2=fib3;
		}

	}

}
