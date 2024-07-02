import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
System.out.println("[INST]8;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]9;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]9;None;sc.next();"+sc.next());
        Integer[] button = {a, b, a - 1, b - 1};

        Arrays.sort(button);
System.out.println("[INST]12;None;Arrays.sort(button);"+Arrays.sort(button));
        int result = button[3] + button[2];

        System.out.println(result);
    }
}