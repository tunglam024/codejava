import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class App113 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < set.size(); i++) {
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            set.add(name);
        }
        System.out.println("Number of set: " + set.size());
        //
        s = sc.nextLine();
        if (set.contains(s))
            System.out.println("Name is in set");
        else
            System.out.println("Name is not in set");
        //
        s = sc.nextLine();
        if (set.contains(s))
            set.remove(s);
        System.out.println("List after remove: " + set);
        //
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < set2.size(); i++) {
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            set2.add(name);
        }
        //
        set.addAll(set2);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("List of set: " + itr.next() + "\t");
        }
        //
        set.removeAll(set2);
        while (itr.hasNext()) {
            System.out.println("List of set: " + itr.next() + "\t");
        }
    }
}