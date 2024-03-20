

```java
import java.util.*;

public class Main {
    static int N;
    static int INF = 1000000000;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        char[] S = new char[20];
        for (int i = 0; i < 20; i++) {
            S[i] = '?';
        }
        System.out.println(func(S, 0, 0));
    }

    static int func(char[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.clone();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) (j + '0');
                    if (Integer.parseInt(new String(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += (int) Math.pow(10, count(S_));
                    }
                }
            }
            ans *= (int) Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.clone();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    static int count(char[] S) {
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            if (S[i] == '?') {
                ans++;
            }
        }
        return ans;
    }
}
```

## 10. 10000000000000000000

```java
import java.util.*;

public class Main {
    static int N;
    static int INF = 1000000000;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        char[] S = new char[20];
        for (int i = 0; i < 20; i++) {
            S[i] = '?';
        }
        System.out.println(func(S, 0, 0));
    }

    static int func(char[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.clone();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) (j + '0');
                    if (Integer.parseInt(new String(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += (int) Math.pow(10, count(S_));
                    }
                }
            }
            ans *= (int) Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.clone();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    static int count(char[] S) {
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            if (S[i] == '?') {
                ans++;
            }
        }
        return ans;
    }
}
```

## 11. 100000000000000000000

```java
import java.util.*;

public class Main {
    static int N;
    static int INF = 1000000000;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        char[] S = new char[20];
        for (int i = 0; i < 20; i++) {
            S[i] = '?';
        }
        System.out.println(func(S, 0, 0));
    }

    static int func(char[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.clone();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) (j + '0');
                    if (Integer.parseInt(new String(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += (int) Math.pow(10, count(S_));
                    }
                }
            }
            ans *= (int) Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.clone();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    static int count(char[] S) {
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            if (S[i] == '?') {
                ans++;
            }
        }
        return ans;
    }
}
```

## 12. 1000000000000000000000

```java
import java.util.*;

public class Main {
    static int N;
    static int INF = 1000000000;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        char[] S = new char[20];
       
