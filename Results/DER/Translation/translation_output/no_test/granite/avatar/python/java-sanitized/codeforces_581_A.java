import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> x = new ArrayList<>();
        for (String s : input) {
            x.add(Integer.parseInt(s));
        }
        int a = x.get(0);
        int b = x.get(1);
        System.out.print(Collections.min(x) + " â ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}