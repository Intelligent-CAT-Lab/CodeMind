System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1101

Expected output:
5


```
import java.util.*;

public class p02667 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] T = sc.next().toCharArray();
		int N = T.length;
		
		int oneSum = 0;
		ArrayList<Integer> indexes = new ArrayList<>();
		for(int i=0; i<N; i++) {
			if(T[i]=='1') {
				int length = 0;
				for(int j=i; j<N; j++) {
					if(T[j]=='1')
						length++;
					else
						break;
				}
				if(length%2==1) {
					indexes.add(i-(oneSum-indexes.size()));
				}
				oneSum += length;
				i += length;
			}
		}
		
		long zeroSum = N-oneSum;
		long ans = (zeroSum+1)*(oneSum-indexes.size())/2;
		
		for(int i=0; i<indexes.size(); i++) {
			int index = indexes.get(i);
			ans += zeroSum+1 - (index-i+(1+i%2))/2;
		}
		
		for(int i=oneSum-1; i>=1; i--) {
			ans += (i+1)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}

}


```


Answer:
```python
def count_subarrays(s):
    n = len(s)
    ans = 0
    for i in range(n):
        if s[i] == '1':
            ans += (n - i) // 2
    return ans

def main():
    s = input()
    ans = count_subarrays(s)
    print(ans)

if __name__ == "__main__":
    main()
```


```python
import unittest

class Test(unittest.TestCase):
    def test_count_subarrays(self):
        self.assertEqual(count_subarrays('1101'), 5)
        self.assertEqual(count_subarrays('111'), 6)
        self.assertEqual(count_subarrays('1010'), 4)

    def test_main(self):
        from io import StringIO
        import sys
        saved_stdout = sys.stdout
        try:
            out = StringIO()
            sys.stdout = out
            main()
            self.assertEqual(out.getvalue(), '5\n')
        finally:
            sys.stdout = saved_stdout

if __name__ == "__main__":
    unittest.main()
```
<|endoftext|>
