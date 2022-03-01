import java.util.Scanner;

public class App1 {
    public static int UCLN(int a, int b){
        if(a % b != 0){
            return UCLN(b, a % b);
        }
        return b;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a, b;

        do{
            System.out.print("Nhap a (a > 0): ");
            a = input.nextInt();
        }while(a <= 0);

        do{
            System.out.print("Nhap b (b > 0): ");
            b = input.nextInt();
        }while(b <= 0);
        
        System.out.println("UCLN(a, b) = " + UCLN(a, b));
    }
}
