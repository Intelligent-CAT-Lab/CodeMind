<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 100

Expected output:
unsafe

```
import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    input = sys.stdin.readline
    S, W = map(int, input().split())
    if W >= S:
        print('unsafe')
    else:
        print('safe')

if __name__ == '__main__':
    main()
```
"""

import sys

def main():
    input = sys.stdin.readline
    S, W = map(int, input().split())
    if W >= S:
        print('unsafe')
    else:
        print('safe')

if __name__ == '__main__':
    main()
<|endoftext|>
