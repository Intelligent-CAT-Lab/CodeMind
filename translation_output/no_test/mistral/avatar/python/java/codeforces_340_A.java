<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def GCD ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def LCM ( a , b ) :
    return a * b // GCD ( a , b )
l = input ( ) . split ( ' â ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = LCM ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```
[/INST]
```java
public class Main {
    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
    public static void main(String[] args) {
        String input = System.console().readLine();
        String[] l = input.split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = LCM(x, y);
        System.out.println((b - 1) / lcm - a / lcm);
    }
}
```</s>
