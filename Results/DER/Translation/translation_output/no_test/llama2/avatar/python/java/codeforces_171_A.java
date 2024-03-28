<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

### Solution

```java
String a, b = input().split(" ");
b = Integer.parseInt(b.substring(0, b.length() - 1));
System.out.println(Integer.parseInt(a) + b);
```

### Explanation

```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )

```

### Big O

- Time: O(n)
- Space: O(n)

### Notes

- The input is a string.
- The input is split into two strings.
- The second string is converted to an integer.
- The first string is converted to an integer.
- The two integers are added.
- The result is printed.
</s>
