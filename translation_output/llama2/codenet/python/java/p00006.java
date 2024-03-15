<s> Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[::-1])

```

### Solution

```java
System.out.println(new String(input().getReverse()));
```

### Explanation

```
input()[::-1]
```

This is a pythonic way of getting the reverse of a string.

```
new String(input().getReverse())
```

This is a java way of getting the reverse of a string.

### Code

```java
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new String(input.getReverse()));
    }
}
```
</s>
