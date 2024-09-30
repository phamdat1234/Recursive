package Recursive;

public class DecimalToBi {

	    // Hàm đệ quy chuyển số thập phân thành nhị phân
	    public static String decimalToBinary(int n) {
	        // Điều kiện dừng: nếu n nhỏ hơn 2, trả về chính nó
	        if (n < 2) {
	            return Integer.toString(n);
	        } else {
	            // Gọi đệ quy với phần nguyên của n chia 2 và nối phần dư
	            return decimalToBinary(n / 2) + Integer.toString(n % 2);
	        }
	    }

	    public static void main(String[] args) {
	        int number = 10; // Số thập phân cần chuyển
	        String binary = decimalToBinary(number); // Chuyển đổi
	        System.out.println("Số nhị phân của " + number + " là: " + binary); // Kết quả
	    }
}