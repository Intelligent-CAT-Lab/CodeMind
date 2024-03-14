import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String s : input) {
            a.add(Integer.parseInt(s));
        }
        Collections.sort(a);

        List<Integer> b = Arrays.asList(1, 4, 7, 9);

        String ans = a.equals(b) ? "YES" : "NO";
        System.out.println(ans);
    }
}