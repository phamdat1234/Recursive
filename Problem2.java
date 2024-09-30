package AlgebraProblems;

public class Problem2 {
    public static int problem2(int value, int num) {
        // Base case: when num reaches 0, stop recursion
        if (num == 0) {
            return 0;
        }
        // Recursive case: compute num^value and add it to the sum of previous values
        return (int) Math.pow(num, value) + problem2(value, num - 1);
    }

    public static void main(String[] args) {
        int value = 2; // The exponent value
        int num = 4;   // The upper limit for the sum
        System.out.println(problem2(value, num)); // Output the result
    }
}
