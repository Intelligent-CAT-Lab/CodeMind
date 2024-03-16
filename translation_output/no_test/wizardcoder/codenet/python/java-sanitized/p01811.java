import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moto = sc.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[moto.length()];
        int i = 0;
        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replace("ABC", "A");
                log[i] = "A";
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replace("ABC", "C");
                log[i] = "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log[i] = "B";
                f = true;
            }
            i++;
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        int l = i;
        for (int j = 0; j < l; j++) {
            s = s.replace(log[l - 1 - j], "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}