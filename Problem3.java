package AlgebraProblems;

public class Problem3 {
	public static int problem3(int index) {
		if(index == 0) {
			return 0;
		}
		return (int)Math.pow(-1, index) * -index + problem3(index - 1); 
	}
	public static void main(String[] args) {
		int index = 7;
		System.out.println(problem3(index));
	}
}
