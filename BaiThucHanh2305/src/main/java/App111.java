import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class App111 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0;
        double x, sum = 0;
        LinkedList<Double> list = new LinkedList<Double>();
        System.out.println("Enter the number of list: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number[" + (i + 1) + "]: ");
            x = sc.nextDouble();
            list.add(x);
        }
        Iterator<Double> itr = list.iterator();
        while (itr.hasNext()) {
            Double a = itr.next();
            if (a % 2 == 0) {
                sum += a;
                dem++;
            }
        }
        System.out.println("Sum of even numbers: " + (sum / dem));

    }
}