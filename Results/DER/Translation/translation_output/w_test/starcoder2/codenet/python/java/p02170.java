

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;
    static int n,k,a;
    static int[] lst;
    static int A;
    static int inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        a = Integer.parseInt(s[2]);
        lst = new int[k+1];
        lst[k-1] = 1;
        A = a*pow(100*n,mod-2,mod);
        inv = pow(n,mod-2,mod);
        for(int i = k-2;i>=0;i--){
            if(k > i + n){
                lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1];
                lst[i] %= mod;
            }else{
                lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }
    static int pow(int a,int b,int mod){
        int res = 1;
        while(b > 0){
            if((b&1) == 1){
                res = res*a%mod;
            }
            a = a*a%mod;
            b >>= 1;
        }
        return res;
    }
}
```

## 1000000000000000000

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;
    static int n,k,a;
    static int[] lst;
    static int A;
    static int inv;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        a = Integer.parseInt(s[2]);
        lst = new int[k+1];
        lst[k-1] = 1;
        A = a*pow(100*n,mod-2,mod);
        inv = pow(n,mod-2,mod);
        for(int i = k-2;i>=0;i--){
            if(k > i + n){
                lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1];
                lst[i] %= mod;
            }else{
                lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }
    static int pow(int a,int b,int mod){
        int res = 1;
        while(b > 0){
            if((b&1) == 1){
                res = res*a%mod;
            }
            a = a*a%mod;
            b >>= 1;
        }
        return res;
    }
}
```

## 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
