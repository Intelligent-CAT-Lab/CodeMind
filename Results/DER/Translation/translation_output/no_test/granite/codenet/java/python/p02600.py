System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p02600 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int k = 0;
    if(400 <= x && x < 600) k = 8;
    else if(600 <= x && x < 800) k = 7;
    else if(800 <= x && x < 1000) k = 6;
    else if(1000 <= x && x < 1200) k = 5;
    else if(1200 <= x && x < 1400) k = 4;
    else if(1400 <= x && x < 1600) k = 3;
    else if(1600 <= x && x < 1800) k = 2;
    else if(1800 <= x && x <= 1999) k = 1;
    System.out.println(k);
  }
}
```


Answer:
```python
import sys

x = int(sys.stdin.read())
k = 0
if 400 <= x and x < 600:
    k = 8
elif 600 <= x and x < 800:
    k = 7
elif 800 <= x and x < 1000:
    k = 6
elif 1000 <= x and x < 1200:
    k = 5
elif 1200 <= x and x < 1400:
    k = 4
elif 1400 <= x and x < 1600:
    k = 3
elif 1600 <= x and x < 1800:
    k = 2
elif 1800 <= x and x <= 1999:
    k = 1

print(k)
```<|endoftext|>
