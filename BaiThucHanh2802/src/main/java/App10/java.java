import java.util.Scanner;

public class App10 {
    public static void main(String[] args){
        int n;
        Scanner nhap = new Scanner(System.in);

        do{
            System.out.print("Nhap n(n > 0): ");
            n = nhap.nextInt();
        }while(n <= 0);

        int soCS = 0, tam = n;
        while(tam > 0){
            soCS++;
            tam /= 10;
        }

        System.out.println(n + " co " + soCS + " chu so");
    }
}
