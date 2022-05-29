import java.util.LinkedList;
import java.util.Scanner;

public class App41_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        list.add("Tháng 1");
        list.add("Tháng 2");
        list.add("Tháng 3");
        list.add("Tháng 4");
        list.add("Tháng 5");
        list.add("Tháng 6");
        list.add("Tháng 7");
        list.add("Tháng 8");
        list.add("Tháng 9");
        list.add("Tháng 10");
        list.add("Tháng 11");
        list.add("Tháng 12");

        System.out.println("Nhập vào phần tử cần xem: ");
        int index = sc.nextInt();
        if ((index < 0) && index > (list.size() - 1))
            System.out.println("Chỉ số không hợp lệ");
        else {
            String node = list.get(index);
            System.out.println("Phần tử thứ " + index + " là: " + node);
        }

        String firstnode = list.getFirst();
        System.out.println("Phần tử đầu tiên là: " + firstnode);
        String lastnode = list.getLast();
        System.out.println("Phần tử cuối cùng là: " + lastnode);
    }
}