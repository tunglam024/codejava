import java.util.Scanner;

public class App4 {
    public static boolean ktNguyenTo(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i < n; i++){
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n (n > 0): ");
            n = input.nextInt();
        }while(n <= 0);

        System.out.println("Cac so nguuyeb to nho hon " + n + " la: ");
        for(int i = 2; i < n; i++){
            if(ktNguyenTo(i))
                System.out.print(i + " ");
            else continue;
        }

    }
}