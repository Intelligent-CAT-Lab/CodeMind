import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p03523 {
    public static void main(String[] args) {
        String S = "KIHBR";
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = Arrays.stream(S.replace("A", "").split(""))
                    .map(String::length)
                    .collect(Collectors.toList());
            List<Integer> X = Arrays.asList(1, 0, 0, 1, 1, 1, 1);
            b = IntStream.range(0, L.size())
                    .allMatch(i -> L.get(i) <= X.get(i));
        }
        System.out.println(b ? "YNEOS" : "spC");
    }
}