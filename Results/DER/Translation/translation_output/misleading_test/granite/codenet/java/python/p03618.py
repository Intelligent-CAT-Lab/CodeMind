System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aatt

Expected output:
5

```
import java.util.*;

public class p03618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] A = sc.next().toCharArray();
		int N = A.length;
		int[] cnt = new int[26];
		for(int i=0; i<N; i++)
			cnt[A[i]-'a']++;
		
		long ans = (long)N*(N+1)/2+1;
		for(int i=0; i<26; i++)
			if(cnt[i]>0)
				ans -= (long)cnt[i]*(cnt[i]+1)/2;
		
		System.out.println(ans);
		
		sc.close();
	}
}

```


Answer:
```python
def main():
    s = input()
    n = len(s)
    cnt = [0] * 26
    for c in s:
        cnt[ord(c) - ord('a')] += 1
    ans = (n * (n + 1) // 2) + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i] * (cnt[i] + 1) // 2)
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "aatt",
]

expected_outputs = [
    5,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    test_output = main(test_input)
    assert test_output == expected_output, f"Expected {expected_output}, got {test_output} for input {test_input}"
```<|endoftext|>
