import java.util.Scanner;

public class App7{
    public static void main(String[] args){
        double temp, max;
        max = -Math.pow(10, 100);

        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("Nhap so: ");
            temp = nhap.nextDouble();
            if(temp > max) max = temp;
        }while(temp != 0);

        System.out.print("So lon nhat trong cac so vua nhap la: " + max);
    }
}
