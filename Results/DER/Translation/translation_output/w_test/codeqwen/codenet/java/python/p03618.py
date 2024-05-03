Here is the Python equivalent of the Java code:

```python
def main():
    A = list(input())
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

This Python code does the same thing as the Java code. It reads a string from the user, counts the frequency of each character in the string, and then calculates the number of substrings that can be formed from the string. The number of substrings is calculated using the formula `(N*(N+1))//2 + 1`, where `N` is the length of the string. Then, it subtracts the number of substrings that can be formed from the string by each character's frequency, using the formula `(cnt[i]*(cnt[i]+1))//2`. Finally, it prints the result.
