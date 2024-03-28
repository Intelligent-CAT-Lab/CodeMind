<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
no


```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        Arrays.sort(nums);
        if (nums[0].equals(nums[1]) && nums[2].equals(nums[3])) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```</s>
