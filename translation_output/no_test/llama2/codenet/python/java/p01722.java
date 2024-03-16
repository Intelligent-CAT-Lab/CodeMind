<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1if n==0else 2//n)
```

### Input

```
4
```

### Output

```
1
```

### Explanation

```
n=4
print(1if n==0else 2//n)
```

### Code

```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(1 if n == 0 else 2 // n);
    }
}
```
</s>
