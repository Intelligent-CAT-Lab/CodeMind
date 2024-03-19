import java.util.*;
import java.io.*;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (2<<d <= l) d++;
        int n = d+1;
        int m = 2*d;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            ans.add(i);
            ans.add(i+1);
            ans.add(0);
            ans.add(i);
            ans.add(i+1);
            ans.add(2<<(i-1));
        }
        while (l > 2<<d) {
            for (int i = n-1; i > 0; i--) {
                if (l-2<<(i-1) > 2<<d-1) {
                    ans.add(i);
                    ans.add(n);
                    ans.add(l-2<<(i-1));
                    m += 1;
                    l -= 2<<(i-1);
                    break;
                }
            }
        }
        System.out.println(n+" "+m);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}