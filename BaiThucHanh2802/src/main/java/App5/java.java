import java.util.Scanner;

public class App5 {
    public static boolean ktHoanThien(int n){
        int tongUoc = 0;
        for(int  i = 1; i < n; i++){
            if(n % i == 0){
                tongUoc += i;
            }
        }
        if(tongUoc == n)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n (n > 0): ");
            n = input.nextInt();
        }while(n <= 0);

        if(ktHoanThien(n))
            System.out.println(n + " la so hoan thien");
        else
            System.out.println(n + " khong phai so hoan thien");
    }
}
