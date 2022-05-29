import java.util.LinkedList;

public class App38_39 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("c++");
        list.add("python");
        list.add("ruby");

        System.out.println("Ví dụ sử dụng phương thức addAll():");

        LinkedList<String> list2 = new LinkedList<String>();
        list2.addAll(list);
        System.out.println("Các phần tử trong list2:");
        ShowList(list2);

        System.out.println("Ví dụ sử dụng phương thức retainAll():");
        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("java");
        list2.retainAll(list3);
        System.out.println("Các phần tử trong list2:");
        ShowList(list2);

        System.out.println("Ví dụ sử dụng phương thức removeAll():");
        LinkedList<String> list4 = new LinkedList<String>();
        list.removeAll(list3);
        System.out.println("Các phần tử trong list:");
        ShowList(list);

    }

    public static void ShowList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj);

        }
        System.out.println();
    }

}