
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
System.out.println("[INST]8;m;scan.nextInt();"+m);
        int f = scan.nextInt();
System.out.println("[INST]9;f;scan.nextInt();"+f);
        int b = scan.nextInt();
System.out.println("[INST]10;b;scan.nextInt();"+b);

        if (m >= b) {
            System.out.println(0);
        } else if (m + f >= b) {
            System.out.println(b - m);
        } else {
            System.out.println("NA");
        }
    }

}
