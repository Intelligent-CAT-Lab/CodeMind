import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong() + 1;
System.out.println("[INST]6;None;scanner.nextLong();"+scanner.nextLong());
        scanner.close();

        // 桁数
        String s = String.valueOf(N);
System.out.println("[INST]10;s;String.valueOf(N);"+s);
        int length = s.length();
System.out.println("[INST]11;length;s.length();"+length);
        int c = Integer.parseInt(s.substring(0, 1));
System.out.println("[INST]12;c;Integer.parseInt(s.substring(0, 1));"+c);
System.out.println("[INST]12;None;s.substring(0, 1);"+s.substring(0, 1));
        int max = (c - 1) + 9 * (length - 1);

        System.out.println(max);
    }
}