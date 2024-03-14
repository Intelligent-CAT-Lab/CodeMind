Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
public class Main {
    public static boolean check(int num) {
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

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
```<|endoftext|>
