import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
System.out.println("[INST]6;n;Integer.parseInt(scanner.next());"+n);
System.out.println("[INST]6;None;scanner.next();"+scanner.next());
        Integer m = Integer.parseInt(scanner.next());
System.out.println("[INST]7;m;Integer.parseInt(scanner.next());"+m);
System.out.println("[INST]7;None;scanner.next();"+scanner.next());
        int total = 0;

        total += (n * (n-1) / 2);
        total += (m * (m-1) / 2);

        System.out.println(total);
    }
}