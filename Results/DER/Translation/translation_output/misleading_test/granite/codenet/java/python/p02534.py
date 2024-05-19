System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
FCo+d&aCL

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
    answer = ""
    for i in range(K):
        answer += "ACL"
    print(answer)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (3, "FCo+d&aCL"),
    (5, "FCo+d&aCLFCo+d&aCLFCo+d&aCLFCo+d&aCLFCo+d&aCL"),
]
for input_value, expected_output in test_cases:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(str(input_value))
    sys.stdin.seek(0)
    main()
    sys.stdout.seek(0)
    actual_output = sys.stdout.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, but got {actual_output}"
```<|endoftext|>
