<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
# Sample test case
K = 3

# Expected output
answer = "FCo+d&aCL"

# Solution
def solve(K):
    answer = ""
    for i in range(K):
        answer += "ACL"
    return answer

def show(answer):
    print(answer)

# Main function
if __name__ == "__main__":
    sc = input()
    m = p02534(sc)
    m.show(m.solve())
```</s>
