import java.util.Scanner;

public class App40 {
    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay: ");
        ngay = sc.nextInt();

        switch (ngay) {
            case 0:
                System.out.print("Chu nhat");
                break;
            case 1:
                System.out.print("Thu hai");
                break;
            case 2:
                System.out.print("Thu ba");
                break;
            case 3:
                System.out.print("Thu tu");
                break;
            case 4:
                System.out.print("Thu nam");
                break;
            case 5:
                System.out.print("Thu sau");
                break;
            case 6:
                System.out.print("Thu bay");
                break;
            default:
                System.out.print("So ngay trong tuan sai");
                sc.close();

        }
    }

}