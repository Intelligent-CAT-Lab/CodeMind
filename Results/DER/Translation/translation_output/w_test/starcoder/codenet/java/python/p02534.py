<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def solve():
    return 'ACL' * K

def main():
    K = int(sys.stdin.readline())
    print(solve())

if __name__ == '__main__':
    main()
```

'''
<|endoftext|>
