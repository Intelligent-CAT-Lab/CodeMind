import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YEv");
                    return;
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k).matches("keyence.*")) {
                System.out.println("YEv");
                return;
            }
        }
        System.out.println("NO");
    }
}