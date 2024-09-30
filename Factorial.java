package Recursive;

public class Factorial {
	public static int factorial (int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		else if(n == 0) return 1;
		else return n * factorial(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Result of " + n +"!:" + factorial(n) );
	}
}
