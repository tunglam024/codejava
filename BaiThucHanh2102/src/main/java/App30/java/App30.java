 import java.util.Scanner;

 public class App30 {
    
    public static void main(String[] args) throws Exception {
       
            Scanner sc= new Scanner(System.in);
            System.out.println("nhập số: ");
            int n=sc.nextInt();
            sc.close();
            int sum=0;
            while(n >0)
            {	sum+=n%10;
                n=n/10;		
            }
            System.out.println("tổng là: "+sum);
        
            
    
        }
    }
