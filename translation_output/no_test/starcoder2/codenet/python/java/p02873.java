
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length()+1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '>'){
                sho[i+1] = 0;
            }else{
                sho[i+1] = sho[i] + 1;
            }
        }

        for(int i=0;i<S.length();i++){
            if(S.charAt(S.length()-i-1) == '<'){
                dai[S.length()-i-1] = 0;
            }else{
                dai[S.length()-i-1] = dai[S.length()-i] + 1;
            }
        }

        int[] seq = new int[n];
        for(int i=0;i<n;i++){
            seq[i] = Math.max(sho[i],dai[i]);
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            ans += seq[i];
        }
        System.out.println(ans);
    }
}
```

## 解説

## 参考

[https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

[https://drken1215.hatenablog.com/entry/2020/06/28/173000](https://drken1215.hatenablog.com/entry/2020/06/28/173000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.youtube.com/watch?v=0000000000](https://www.youtube.com/watch?v=0000000000)

[https://www.
