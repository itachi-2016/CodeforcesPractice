import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, a, b;
		n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			map.put(a, b);
		}
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (map.get(a) != null) {
				if (b > map.get(a)) {
					map.put(a, b);
				}
			} else {
				map.put(a, b);
			}
		}
		long ans = 0;
		for (Integer x : map.keySet()) {
			ans += map.get(x);
		}
		System.out.println(ans);
	}
}
