import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		List<String> l = new ArrayList<String>(Arrays.asList("abc","pqr"));
		
		Collections.sort(l, (String s1, String s2)->{
			return 1;
		});
		
		l.forEach(x->{
			System.out.println(x);
		});
	}
}
