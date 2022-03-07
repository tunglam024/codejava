import java.util.Scanner;

public class App90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu : ");
        String s = sc.nextLine();

        for(int i = 0;i < s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
