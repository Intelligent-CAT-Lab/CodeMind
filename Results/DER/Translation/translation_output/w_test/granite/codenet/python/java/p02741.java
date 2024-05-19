System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
2


```
nums = [0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
print(nums[int(input())])
```


Answer:
```java
public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        System.out.println(nums[Integer.parseInt(args[0])]);
    }
}
```

You can test this code with the following test case:

```java
public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[]{"6"});
        assertEquals(2, System.out.nextInt());
    }
}
```<|endoftext|>
