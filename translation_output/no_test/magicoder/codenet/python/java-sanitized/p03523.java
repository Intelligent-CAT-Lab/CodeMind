import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = "".join("*" if s != "A" else s for s in S).split("*");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= java.util.stream.IntStream.range(0, L.length).allMatch(i -> L[i].length() <= X[i]);
        }
        System.out.println(b ? "YNEOS" : "YNEOS".substring(1));
    }
}