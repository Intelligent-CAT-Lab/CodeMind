import java.util.*;
import java.io.*;

public class p03483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] c = new int[26];
        for(int i=0;i<n;i++) c[s.charAt(i)-'a']++;
        int ans = 0;
        if(n%2==0) {
            for(int i=0;i<26;i++) {
                if(c[i]%2!=0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            int flg = 0;
            for(int i=0;i<26;i++) {
                if(c[i]%2!=0) {
                    if(flg==1) {
                        System.out.println(-1);
                        return;
                    }
                    flg = 1;
                }
            }
        }
        int ptr = 0;
        int[] perm = new int[n/2];
        int[] fstr = new int[n/2];
        int[] lstr = new int[n/2];
        int[] fdc = new int[26];
        int[] ldc = new int[26];
        for(int i=0;i<n;i++) {
            int si = s.charAt(i)-'a';
            fdc[si]++;
            if(c[si]%2!=0) {
                if(fdc[si]*2-1==c[si]) {
                    ans += i-ptr;
                    continue;
                }
            }
            if(fdc[si]<=c[si]/2) {
                ans += i-ptr;
                ptr += 1;
                fstr[i/2] = si;
            } else {
                lstr[i/2] = si;
            }
        }
        lstr = reverse(lstr);
        n/=2;
        for(int i=0;i<n;i++) {
            int fi = fstr[i];
            perm[i] = fdc[fi][ldc[fi]];
            ldc[fi]++;
        }
        Bit sol = new Bit(n+2);
        for(int i=0;i<n;i++) {
            int p = perm[i];
            ans += sol.sum(n+1)-sol.sum(p);
            sol.add(p,1);
        }
        System.out.println(ans);
    }
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i] = arr[n-i-1];
        return ans;
    }
}
class Bit {
    int[] tree;
    int size;
    public Bit(int n) {
        size = n;
        tree = new int[n+1];
    }
    public int sum(int i) {
        int s = 0;
        while(i>0) {
            s += tree[i];
            i -= i&-i;
        }
        return s;
    }
    public void add(int i,int x) {
        while(i<=size) {
            tree[i] += x;
            i += i&-i;
        }
    }
}