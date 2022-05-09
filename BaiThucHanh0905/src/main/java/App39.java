import java.util.Scanner;
import java.util.LinkedList;

public class App39 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<String> LinkedList = new LinkedList<>();
        LinkedList.add("tháng 1");
        LinkedList.add("tháng 2");
        LinkedList.add("tháng 3");
        LinkedList.add("tháng 4");
        LinkedList.add("tháng 5");
        LinkedList.add("tháng 6");
        LinkedList.add("tháng 7");
        LinkedList.add("tháng 8");
        LinkedList.add("tháng 9");
        LinkedList.add("tháng 10");
        LinkedList.add("tháng 11");
        LinkedList.add("tháng 12");
        
        System.out.println("Nhập vào chỉ số của phân tử cần lấy: ");
        int index = scanner.nextInt(); 
    }
}