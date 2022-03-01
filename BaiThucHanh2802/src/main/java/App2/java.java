import java.util.Scanner;

public class App2 {
    public static boolean ktvuong(double a, double b, double c){
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        if(a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c;
        do{
            System.out.println("Nhap lan luot 3 canh cua tam giac thoa man:");
            System.out.println("a, b, c > 0 va tong 2 canh bat ki lon hon canh con lai: ");
        
                a = input.nextDouble();
                b = input.nextDouble();
                c = input.nextDouble();
        }while(a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a);

        System.out.print("Tam giac co tinh chat: ");
        if(a == b || b == c || a == c){
            if(a == b && b == c)
                System.out.println("Deu");
            else {
                if(ktvuong(a, b, c))
                    System.out.println("Vuong Can");
                else
                    System.out.println("Can");
            }
        }
        else{
            if(ktvuong(a, b, c))
                System.out.println("Vuong");
            else
                System.out.println("Thuong");
        }
    }
}
