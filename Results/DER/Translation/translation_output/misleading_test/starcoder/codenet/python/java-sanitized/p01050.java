import java.util.*;
public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] abc = new int[28];
        int[] num = new int[12];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                abc[s.charAt(i) - 'a']++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num[s.charAt(i) - '0']++;
            }
        }
        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;
        for(int i = 0; i < 26; i++) {
            abc_sum += abc[i];
        }
        for(int i = 0; i < 10; i++) {
            num_sum += num[i];
        }
        while(abc_sum > 0) {
            int start = 100;
            int current = 0;
            while(current < 26) {
                if(abc[current] == 0) {
                    current++;
                    continue;
                }
                if(abc[current + 1] == 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_sum--;
                    break;
                }
                if(abc[current] > 0) {
                    abc[current]--;
                    abc_sum--;
                }
                current++;
            }
        }
        while(num_sum > 0) {
            int start = 100;
            int current = 0;
            while(current < 10) {
                if(num[current] == 0) {
                    current++;
                    continue;
                }
                if(num[current + 1] == 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_sum--;
                    break;
                }
                if(num[current] > 0) {
                    num[current]--;
                    num_sum--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}