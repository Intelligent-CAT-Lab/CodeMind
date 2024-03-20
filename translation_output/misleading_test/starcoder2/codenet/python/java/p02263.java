

```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } else if (n[i].equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (n[i].equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.pop());
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```
/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic-programming/01-basic
