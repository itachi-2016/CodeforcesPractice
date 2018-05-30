import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("red", "Reality");
		map.put("blue", "Space");
		map.put("yellow", "Mind");
		map.put("orange", "Soul");
		map.put("purple", "Power");
		map.put("green", "Time");
		List l = new ArrayList();
		l.add("green");
		l.add("red");
		l.add("blue");
		l.add("purple");
		l.add("orange");
		l.add("yellow");
		int n = sc.nextInt();
		Iterator<String> it = l.iterator();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
			l.remove(str[i]);
		//	System.out.println(l.size());
		}
		System.out.println(6 - n);
		for(int i=0;i<l.size();i++) {
			System.out.println(map.get(l.get(i)));
		}
	}
}
