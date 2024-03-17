<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

class p02534:
    def __init__(self, sc):
        self.sc = sc
        self.K = int(sc.readline())

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    m = p02534(sys.stdin)
    m.show(m.solve())
```

In this Python code, we have a class `p02534` that takes an input stream `sc` in its constructor. The `solve` method generates a string of "ACL" repeated `K` times, and the `show` method prints this string. The main part of the code creates an instance of `p02534` with `sys.stdin` as the input stream, solves the problem and shows the result.
<|EOT|>
