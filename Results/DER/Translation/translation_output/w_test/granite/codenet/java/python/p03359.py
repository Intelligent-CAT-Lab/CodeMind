System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5

Expected output:
5


```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if b >= a:
        print(a)
    else:
        print(a - 1)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "5 5"
expected_output = "5"

def test_main():
    with patch('builtins.input', side_effect=[test_input]):
        main()
        captured = capsys.readouterr()
        assert captured.out == expected_output

test_main()
```<|endoftext|>
