import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        
        if (b) {
            String modifiedS = S.replaceAll("[^A]", "*");
            String[] splitS = modifiedS.split("\\*");
            int[] L = new int[splitS.length];
            for (int i = 0; i < splitS.length; i++) {
                L[i] = splitS[i].length();
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i] > X[i]) {
                    b = false;
                    break;
                }
            }
        }

        System.out.println(b ? "YES" : "NO");
        scanner.close();
    }
}