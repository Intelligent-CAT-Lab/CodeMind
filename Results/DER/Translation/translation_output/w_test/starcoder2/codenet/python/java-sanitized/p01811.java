import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moto = sc.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[100];
        int l = 0;
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log[l] = "A";
                l++;
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log[l] = "C";
                l++;
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log[l] = "B";
                l++;
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        for (int i = l - 1; i >= 0; i--) {
            s = s.replace(log[i], "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}