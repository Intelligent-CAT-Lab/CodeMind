import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int tax8pricemin = (int)(((double)a) / 0.08);
        int tax8pricemax = (int)(((double)a + 1) / 0.08);

        for(int i = tax8pricemin ; i < tax8pricemax; i++){
            int tax8 = (int)(i * 0.08);
            int tax10 = (int)(i * 0.1);

            if(tax8 == a && tax10 == b){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}