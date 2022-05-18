import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class App84 {
	public static void main(String[] args) {
		HashMap<String, String> hashmapstring=new HashMap<>();
		hashmapstring.put("CSLT", "co so lap trinh");
		hashmapstring.put("C++", "C++");
		hashmapstring.put("C#", "C Sharp");
		hashmapstring.put("PHP", "PHP");
		hashmapstring.put("JAVA", "JAVA");
		Set<Map.Entry<String,String>> setHashMap=hashmapstring.entrySet();
		System.out.println("cac entry co trong sethashmap la: "+setHashMap);
	}
}