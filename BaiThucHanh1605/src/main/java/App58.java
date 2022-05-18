import java.util.LinkedHashSet;
import java.util.Set;
public class App58 {
public static void main(String[] args) {
	Set<String> linkhashset=new LinkedHashSet<String>();
	linkhashset.add("java");
	linkhashset.add("c++");
	linkhashset.add("python");
	linkhashset.add("php");
	for(String s:linkhashset) {
		System.out.println(s);
	}
}
}