import java.util.Scanner;

public class App9 {
    public static void main(String[] args){
        int n;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("Nhap n (n > 0): ");
            n = nhap.nextInt();
        }while(n <= 0);

        int dao = 0;
        while(n > 0){
            dao = dao * 10 + n % 10;
            n /= 10;
        }

        System.out.println("So vua nhap in theo thu tu nguoc lai la: " + dao);

    } 
}