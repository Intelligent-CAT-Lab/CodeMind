<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
23


```
def check(num):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                return False
                break
        else:
            return True
    else:
        return False


a = int(input())

for i in range(a, 100500):
    if check(i):
        print(i)
        break
```
[/INST]
```java
public class Check {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i <= 100500; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
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
Note: The `isPrime` method is a modified version of the `check` method in the Python code. It takes an integer `num` as input and returns `true` if `num` is prime, and `false` otherwise. The `main` method takes an integer `a` as input, and then loops through the range of numbers from `a` to 100500, calling the `isPrime` method on each number. If the `isPrime` method returns `true`, the number is printed and the loop is broken.</s>
