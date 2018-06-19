import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String q = sc.next();
		char[] c_arr = q.toCharArray();
		List<Character> c_set = new LinkedList<>();
		List<Character> c_list = new LinkedList<>();
		Map<Character, Boolean> m = new HashMap<>();
		for (char element : c_arr) {
			if (m.get(element) == null) {
				c_set.add(element);
				m.put(element, true);
			}
			c_list.add(element);
		}
		if (c_set.size() < k) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			int[] arr = new int[c_set.size()];
			int i = 0;
			for (char ele : c_set) {
				arr[i] = c_list.indexOf(ele);
				i++;
			}
			int p;
			for (i = 0; i < Math.min(k, c_set.size()); i++) {
				if (i == Math.min(k, c_set.size()) - 1) {
					p = c_arr.length;
				} else {
					p = arr[i + 1];
				}
				for (int j = arr[i]; j < p; j++) {
					System.out.print(c_arr[j]);
				}
				System.out.println();
			}
		}

	}
}
