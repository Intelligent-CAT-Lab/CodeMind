<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def gcd(a, b):
    '''ã¦ã¼ã¯ãªããäºé¤æ³ãä½¿ã£ãæå¤§å¬ç´æ°ã®æ±ãæ¹'''
    while b != 0:
        a, b = b, a % b
    return(a)


def lcm(a, b):
    '''æå°å¬åæ°ã®æ±ãæ¹'''
    return a * b // gcd(a, b)

A, B = list(map(int, input().split()))

print(lcm(A,B))
```
[/INST]
```java
public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(lcm(A, B));
    }
}
```</s>
