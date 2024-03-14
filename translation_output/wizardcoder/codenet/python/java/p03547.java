Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A=int(10)
B=int(11)
C=int(12)
D=int(13)
E=int(14)
F=int(15)

N,M=input().split()
if N>M:
  print(">") 
elif N==M:
  print("=")
else:
  print("<")

```

### Response:
```java
int A = 10;
int B = 11;
int C = 12;
int D = 13;
int E = 14;
int F = 15;

Scanner input = new Scanner(System.in);
String[] numbers = input.nextLine().split(" ");
int N = Integer.parseInt(numbers[0]);
int M = Integer.parseInt(numbers[1]);

if (N > M) {
  System.out.println(">");
} else if (N == M) {
  System.out.println("=");
} else {
  System.out.println("<");
}
```<|endoftext|>
