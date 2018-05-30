import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		double a = x * Math.log(y) - y * Math.log(x);
		if (a > 0) {
			System.out.println("<");
		} else if (a == 0) {
			System.out.println("=");
		} else {
			System.out.println(">");
		}
	}
}
