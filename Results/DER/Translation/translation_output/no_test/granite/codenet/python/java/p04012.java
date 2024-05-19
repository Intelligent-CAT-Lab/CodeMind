System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```


Answer:
```java
String alfa = "abcdefghijklmnopqrstuvwxyz";
String w = new Scanner(System.in).nextLine();
for (char i : alfa.toCharArray()) {
    if (w.length() % 2 == 1) {
        System.out.println("No");
        System.exit(0);
    }
}
System.out.println("Yes");
```<|endoftext|>
