Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
++
#B|
!9H

```
w,h,c=input().split(" ")
w=int(w)
h=int(h)
print("+"+"-"*(w-2)+"+")
for i in range(h-2):
    if i*2==h-3:
        print("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|")
    else:
        print("|"+"."*(w-2)+"|")
print("+"+"-"*(w-2)+"+")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);
        System.out.println("+"+"-"*(w-2)+"+");
        for(int i=0;i<h-2;i++){
            if(i*2==h-3){
                System.out.println("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|");
            }else{
                System.out.println("|"+"."*(w-2)+"|");
            }
        }
        System.out.println("+"+"-"*(w-2)+"+");
    }
}
```<|endoftext|>
