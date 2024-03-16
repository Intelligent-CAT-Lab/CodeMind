> Translate the following python code to java and enclose your solution inside :

from functools import lru_cache  # ãã¾ããªã

l,k=map(int,input().split())

@lru_cache()     # python ç´ æ´ããã
def rec(i,isBlack):
    if i < 0: return 0
    if i == 0: return 1 if not isBlack else 0  # black at bottom
    if isBlack: # top is black
        return rec(i-1, False) + rec(i-k, False)
    else:  # top is white
        return rec(i-1, True)

ans = sum ( rec(i,True) for i in range(1, l+1))
    
print(ans)




## 解答


import java.util.Arrays;
import java.util.Scanner;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0) {
                ans += rec(i, true);
            } else {
                ans += rec(i, false);
            }
        }
        System.out.println(ans);
    }

    public static int rec(int i, boolean isBlack) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return 1 if (!isBlack) else 0;
        }
        if (isBlack) {
            return rec(i - 1, false) + rec(i - k, false);
        } else {
            return rec(i - 1, true);
        }
    }
}