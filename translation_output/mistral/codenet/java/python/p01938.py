<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    list = sys.stdin.readline().split()
    a = ord('A')
    sum = 0
    for i in range(len(list)):
        if int(list[i]) <= a:
            sum += 1
        a = int(list[i])
    print(sum)

if __name__ == '__main__':
    main()
```</s>
