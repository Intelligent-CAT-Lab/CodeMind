import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int l = Integer.parseInt(split[0]);
        int r = Integer.parseInt(split[1]);
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev.append(String.valueOf(9 - Integer.parseInt(String.valueOf(k))));
                }
                ans = Math.max(ans, Integer.parseInt(rev.toString()) * curr);
            }
        }
        System.out.println(ans);
    }
}