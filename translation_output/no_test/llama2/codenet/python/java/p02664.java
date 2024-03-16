<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()

a=list(a)

for i in range(len(a)):
	if a[i]=="?":
		a[i]="D"

b=""
for i in range(len(a)):
	b+=a[i]

print(b)
```

### Solution

```java
String a = input();

String[] aArray = a.split("");

for (int i = 0; i < aArray.length; i++) {
    if (aArray[i].equals("?")) {
        aArray[i] = "D";
    }
}

String b = "";
for (int i = 0; i < aArray.length; i++) {
    b += aArray[i];
}

System.out.println(b);
```
</s>
