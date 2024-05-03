Here is the Java version of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());

        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, then it checks each integer from the input number to 100500 (inclusive) to see if it is a prime number. If it finds a prime number, it prints it and breaks the loop.
