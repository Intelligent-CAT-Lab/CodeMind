import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] parts = S.replaceAll("[^A]", "").split("");
            List<Integer> L = new ArrayList<>();
            for (String part : parts) {
                L.add(part.length());
            }
            List<Integer> X = Arrays.asList(1, 0, 0, 1, 1, 1, 1);
            for (int i = 0; i < L.size(); i++) {
                if (L.get(i) > X.get(i)) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "spC" : "YNEOS");
    }
}