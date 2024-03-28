import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p02149 {
    public static void main(String[] args) {
        List<Integer> S = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (S.indexOf(Collections.max(S)) == 0) {
            System.out.println("A");
        } else if (S.indexOf(Collections.max(S)) == 1) {
            System.out.println("B");
        } else if (S.indexOf(Collections.max(S)) == 2) {
            System.out.println("C");
        }
    }
}