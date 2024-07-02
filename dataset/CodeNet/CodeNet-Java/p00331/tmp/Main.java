import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
System.out.println("[INST]5;None;sc.hasNextInt();"+sc.hasNextInt());
            int H = sc.nextInt();
System.out.println("[INST]6;H;sc.nextInt();"+H);
            int R = sc.nextInt();
System.out.println("[INST]7;R;sc.nextInt();"+R);

            if ( H < 0 && Math.abs(H) == R ) {
System.out.println("[INST]9;None;Math.abs(H);"+Math.abs(H));
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}

