import java.util.*;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> ABC = new ArrayList<>();
        for (String s : input) {
            ABC.add(Integer.parseInt(s));
        }
        if (ABC.stream().filter(i -> i == 5).count() == 2) {
            if (ABC.stream().mapToInt(Integer::intValue).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}