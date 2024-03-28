<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
33

Expected output:
2 -1


```
x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=-1000;i<=1000;i++){
            for(int j=-1000;j<=1000;j++){
                if(i*i*i*i*i-j*j*j*j*j==x){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
```
'''
<|endoftext|>
