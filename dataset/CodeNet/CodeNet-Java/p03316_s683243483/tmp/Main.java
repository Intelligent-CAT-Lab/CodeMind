import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
System.out.println("[INST]8;n;sc.nextInt();"+n);

        String strn = String.valueOf(n);
System.out.println("[INST]10;strn;String.valueOf(n);"+strn);
        int len = strn.length();
System.out.println("[INST]11;len;strn.length();"+len);

        String ans;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(strn.substring(i, i + 1));
System.out.println("[INST]16;sum;Integer.parseInt(strn.substring(i, i + 1));"+sum);
System.out.println("[INST]16;None;strn.substring(i, i + 1);"+strn.substring(i, i + 1));
        }
        if (n % sum == 0) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}