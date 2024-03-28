<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```
[/INST]
```python
import sys

def main():
    for i in range(3):
        print(ord(sys.stdin.read(1)) - ord('a') + ord('A'))

if __name__ == '__main__':
    main()
```</s>
