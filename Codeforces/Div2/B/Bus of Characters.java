import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, count = 0, val;
		int[] arr = new int[n];
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			arr[i] = a;
			m.put(a, i + 1);
		}
		StringBuilder answer = new StringBuilder();
		Arrays.sort(arr);
		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
		String s = sc.next();
		for (int i = 0; i < 2 * n; i++) {
			if (s.charAt(i) == '0') {
				val = m.get(arr[count]);
				pq.add(arr[count]);
				count++;
				answer = answer.append(val+" ");
			} else {
				val = m.get(pq.peek());
				pq.remove();
				answer = answer.append(val+" ");
			}
		}
		System.out.print(answer);
	}
}
