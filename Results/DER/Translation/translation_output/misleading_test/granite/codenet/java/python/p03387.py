System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
25

```
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03387 {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
x[0]=sc.nextInt();
x[1]=sc.nextInt();
x[2]=sc.nextInt();
Arrays.sort(x);
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}
```


Answer:
```python
import sys

def main():
    x = [int(i) for i in sys.stdin.readline().split()]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    ans = temp // 2 + 1 if temp % 2 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "2 5 4"
expected_output = "25"

def test_main():
    from io import StringIO
    from unittest.mock import patch

    with patch("sys.stdin", StringIO(test_input)):
        with patch("sys.stdout", new_callable=StringIO) as fake_out:
            main()
            actual_output = fake_out.getvalue().strip()
            assert actual_output == expected_output

test_main()
```<|endoftext|>
