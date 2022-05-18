import java.util.Set;
import java.util.LinkedHashMap;

public class App95 {
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> LinkedHashMap = new LinkedHashMap<Integer, String>();
        LinkedHashMap.put(1, "Java");
        LinkedHashMap.put(2, "C++");
        LinkedHashMap.put(3, "C#");
        LinkedHashMap.put(4, "PHP");

        System.out.println("Before remove:");
        show(LinkedHashMap);
        LinkedHashMap.remove(2);
        System.out.println("After remove:");
        show(LinkedHashMap);
    }
}