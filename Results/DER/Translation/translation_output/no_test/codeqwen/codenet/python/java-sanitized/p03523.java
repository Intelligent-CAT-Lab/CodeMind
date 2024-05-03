import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p03523 {
    public static void main(String[] args) {
        String S = System.console().readLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = Arrays.stream(S.replace("A", "").split(""))
                    .collect(Collectors.groupingBy(s -> s))
                    .values().stream()
                    .map(List::size)
                    .collect(Collectors.toList());
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= L.stream().allMatch(l -> l <= X[L.indexOf(l)]);
        }
        System.out.println(b ? "YES" : "NO");
    }
}