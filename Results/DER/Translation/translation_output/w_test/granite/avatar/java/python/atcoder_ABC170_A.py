System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
5


```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```


Answer:
```python
import sys

def main():
    count = [0] * 5
    for i, x in enumerate(map(int, sys.stdin.readline().split())):
        count[i] += x
        if count[i] == 0:
            print(i + 1)
            return

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = '1 2 3 4 0'
expected_output = '5'

def test_atcoder_ABC170_A():
    from io import StringIO
    from unittest.mock import patch
    from sys import stdout

    test_input = StringIO(test_input)
    expected_output = expected_output + '\n'

    with patch('sys.stdin', test_input), patch('sys.stdout', new_callable=StringIO) as fake_out:
        main()
        actual_output = fake_out.getvalue()
        assert actual_output == expected_output

test_atcoder_ABC170_A()
```<|endoftext|>
