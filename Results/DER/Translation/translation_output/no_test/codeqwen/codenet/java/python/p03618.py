Here is the Python equivalent of the Java code:

```python
import sys

def main():
    A = list(sys.stdin.readline().strip())
    N = len(A)
    cnt = [0]*26
    for i in range(N):
        cnt[ord(A[i])-ord('a')] += 1
    
    ans = (N*(N+1))//2 + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i]*(cnt[i]+1))//2
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, converts it to a list of characters, and then counts the occurrences of each character. It then calculates the number of distinct substrings that can be formed from the input string and prints the result.
