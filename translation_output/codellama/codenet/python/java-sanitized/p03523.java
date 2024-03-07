import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = "".join("*" if s != "A" else s for s in S).split("*");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= all(L[i] <= X[i] for i in range(len(L)));
        }
        System.out.println("YNEOS"[not b::2]);
    }
}