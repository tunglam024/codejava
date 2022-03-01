import java.util.Scanner;

public class App8{
    public static void main(String[] args){
        double temp, max;
        max = -Math.pow(10, 100);

        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("Nhap so: ");
            temp = nhap.nextDouble();
            if(temp > max && temp % 5 == 0) max = temp;
        }while(temp != 0);

        if(max == -Math.pow(10, 100)) 
            System.out.print("khong co so nao chia het cho 5");
        else
            System.out.print("So lon nhat chia het cho 5 trong cac so vua nhap la: " + max);
    }
}
