<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
80

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
[/INST]
```python
import sys

def main():
    list = sys.stdin.readline().strip().split()
    a = ord('A')
    sum = 0
    for i in range(len(list)):
        if ord(list[i]) <= a:
            sum += 1
        a = ord(list[i])
    print(sum)

if __name__ == '__main__':
    main()
```</s>
