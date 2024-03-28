<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        System.out.println(ans.toString().replaceAll(",", " "));
    }
}
```</s>
