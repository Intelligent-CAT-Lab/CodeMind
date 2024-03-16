import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        
        int first = (int)Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        
        int[] candidates = new int[]{l, r, first, second};
        
        for (int i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                String currAsString = Integer.toString(curr);
                
                for (char k : currAsString.toCharArray()) {
                    rev.append(9 - (k - '0'));
                }
                
                int revInt = Integer.parseInt(rev.toString());
                ans = Math.max(ans, revInt * curr);
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}