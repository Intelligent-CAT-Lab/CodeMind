<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

```

### 解答

```java
String a = input();
String b = input();
int aInt = Integer.parseInt(a);
int bInt = Integer.parseInt(b);

if (0 < aInt && aInt < 10 && 0 < bInt && bInt < 10) {
    System.out.println(aInt * bInt);
} else {
    System.out.println("-1");
}
```

### 解析

1. 将python的`input()`转换为java的`String`
2. 将python的`split()`转换为java的`String[]`
3. 将python的`int()`转换为java的`int`
4. 将python的`if`转换为java的`if`
5. 将python的`print()`转换为java的`System.out.println()`

### 参考

[Python to Java](https://www.geeksforgeeks.org/python-to-java/)
</s>
