<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

def main():
    line = sys.stdin.readline().strip()
    a = ord('A')
    sum = 0
    for c in line:
        if ord(c) <= a:
            sum += 1
        a = ord(c)
    print(sum)

if __name__ == '__main__':
    main()
```
<|endoftext|>
