<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```

### Solution

```java
String x = input();
int a = 0;
for (char i : x.toCharArray()) {
  if (i == 'x') {
    a++;
  }
}
System.out.println(["NO", "YES"][a <= 7]);
```
</s>
