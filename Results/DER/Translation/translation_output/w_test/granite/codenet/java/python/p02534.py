System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
ACLACLACL


```
import java.util.Scanner;

public class p02534 {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        p02534 m = new p02534(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//ãã£ã¼ã«ã
    Scanner sc;
    int K;;
    
    //å¥å
    p02534(Scanner sc) {
        this.sc = sc;
        this.K = sc.nextInt();
    }
    
    //è§£ç­å¦ç
    private String solve() {
        String answer = "";
        for (int i = 0; i < K; i++) {
        	answer += "ACL";
        }
        
        return answer;
    }
    
    //åºå
    public void show(String answer) {
        System.out.println(answer);
    }

}

```


Answer:
```python
import sys

def main():
    K = int(input())
    print("ACL" * K)

if __name__ == "__main__":
    sys.exit(main())
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    test_inputs = [
        "3",
    ]
    expected_outputs = [
        "ACLACLACL",
    ]
    for test_input, expected_output in zip(test_inputs, expected_outputs):
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                actual_output = fake_out.getvalue().strip()
                assert actual_output == expected_output
```<|endoftext|>
