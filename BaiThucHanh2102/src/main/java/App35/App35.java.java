import java.util.Scanner;

public class App35 {
    public static void main(String[] args){
        int s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: "); s1 = sc.nextInt();        
        System.out.print("Nhap so thu hai: "); s2 = sc.nextInt();
        
        int min = (s1 > s2) ? s2 : s1;
        System.out.println("So nho trong hai so la: " + min);
    }
}
