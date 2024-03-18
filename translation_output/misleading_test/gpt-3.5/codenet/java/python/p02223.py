```python
import sys

def main():
    N = int(input())
    if N == 1:
        print(1)
        print(0)
    elif N == 2:
        print(2)
        print(0)
        print(11)
    else:
        print(N - 1)
        for i in range(2, N+1):
            s = ['1' for _ in range(i)]
            s[0], s[i-1] = '0', '0'
            print(''.join(s))

if __name__ == "__main__":
    main()
``` 

Test input:
2

Expected output:
2
0
11
