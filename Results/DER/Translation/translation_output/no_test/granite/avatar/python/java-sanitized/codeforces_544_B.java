import java.util.*;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int start = 0;
        List<String> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        sb.append(" L ");
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = start == 0? 1 : 0;
                        }
                    } else {
                        sb.append(" S ");
                    }
                } else {
                    sb.append(" S ");
                }
            }
            arr.add(sb.toString());
        }
        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}