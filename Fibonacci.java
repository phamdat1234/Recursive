package Recursive;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} 
			return fibonacci(n - 1) + fibonacci(n - 2);
	}	
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Kết quả của dãy fibonacci ở vị trí n bằng " + n + " : " + fibonacci(n));
	}
}
