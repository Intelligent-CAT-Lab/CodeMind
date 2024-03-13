<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class p01938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] list=br.readLine().toCharArray();
        char a='A';
        int sum=0;
        for(int i=0;i<list.length;i++){
            if(list[i]<=a){
                sum++;
            }
            a=list[i];
        }
        System.out.println(sum);
    }
}
```

@@ Response
```python
import sys

def main():
    line = sys.stdin.readline().strip()
    list = [char for char in line]
    a = 'A'
    sum = 0
    for i in range(len(list)):
        if ord(list[i]) <= ord(a):
            sum += 1
        a = list[i]
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, converts it to a list of characters, and then iterates over the list. For each character, it checks if its ASCII value is less than or equal to the ASCII value of the previous character. If it is, it increments the sum. Finally, it prints the sum.<｜end▁of▁sentence｜>
