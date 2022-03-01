public class App11 {
    public static void main(String[] args){
        int tien1 = 10,
            tien2 = 20,
            tien3 = 50;
        int max1 = 200 / tien1,
            max2 = 200 / tien2,
            max3 = 200 / tien3;
        System.out.println("Cac truong hop co the xay ra la: ");
        for(int i = 0; i <= max1; i++)
            for(int j = 0; j<= max2; j++)
                for(int k = 0; k <= max3; k++)
                    if(i * tien1 + j * tien2 + k * tien3 == 200){
                        System.out.println(i + " to tien 10000, " + j + " to tien 20000 va " + k + " to tien 50000");
                    }
            
    }   
}
