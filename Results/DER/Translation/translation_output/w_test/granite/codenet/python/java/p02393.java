System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String num : input) {
            nums.add(Integer.parseInt(num));
        }
        Collections.sort(nums);
        System.out.println(nums.get(0) + " " + nums.get(1) + " " + nums.get(2));
    }
}
```

Test input:
```
3 8 1
```

Expected output:
```
1 3 8
```<|endoftext|>
