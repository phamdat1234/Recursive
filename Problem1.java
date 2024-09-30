package AlgebraProblems;

public class Problem1 {
	public static int factorial2(int value){
		if (value == 1) {
			return 1;
		} else {
			return value * factorial2(value - 1);
		}
	}
	public static void main(String[] args) {
		int index = 6;
		System.out.println(factorial2(index));
	}
}
