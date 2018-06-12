import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n, m;
		n = sc.nextLong();
		m = sc.nextLong();
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(Math.min((n % m) * b, (m - n % m) * a));
	}
}
