import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "" + in.nextInt();
System.out.println("[INST]5;None;in.nextInt();"+in.nextInt());

        int rs = 0;
        for (char c : s.toCharArray()) {
System.out.println("[INST]8;None;s.toCharArray();"+s.toCharArray());
            if (c == '2') rs++;
        }

        System.out.println(rs);
    }
}
