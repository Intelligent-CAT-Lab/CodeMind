Below is the translated Python code for the Java code provided:

```python
from sys import stdin

MOD = 0
k = 0
n = 0
numberOfSequencesOfSizeIwithElementBiggerThenJ = [[0]*301 for _ in range(301)]
sumValue = [[0]*301 for _ in range(301)]
nChK = [[0]*301 for _ in range(301)]

def preComputeNChooseK_MOD_Mod(maxn, MOD):
    res = [[0]*(i+1) for i in range(maxn+1)]
    for i in range(maxn+1):
        res[i][0] = 1
        res[i][i] = 1
    for i in range(2, maxn):
        for j in range(1, (i >> 1) + 1):
            ress = (res[i-1][j] + res[i-1][j-1]) % MOD
            res[i][j] = ress
            res[i][i-j] = ress
    return res

def solve():
    global MOD, k, n, numberOfSequencesOfSizeIwithElementBiggerThenJ, sumValue, nChK
    n, k, MOD = map(int, stdin.readline().split())
    nChK = preComputeNChooseK_MOD_Mod(n, MOD)
    for j in range(k, -1, -1):
        numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % MOD
        numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (k-j) % MOD
    
    sumValue[0][k] = 1
    sumValue[1][k] = 0

    for j in range(k-1, -1, -1):
        sumValue[0][j] = (sumValue[0][j+1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % MOD
        sumValue[1][j] = (sumValue[1][j+1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % MOD

    for i in range(2, n+1):
        for j in range(k-1, -1, -1):
            res = 0
            for sizeToTheLeft in range(i):
                optionLeft = sumValue[sizeToTheLeft][j+1]
                optionRight = numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j]
                optionToAddToEachSide = nChK[i-1][sizeToTheLeft]
                res = (res + (((optionLeft * optionRight) % MOD) * optionToAddToEachSide) % MOD) % MOD
            
            numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res
            sumValue[i][j] = (sumValue[i][j+1] + res) % MOD

    print(numberOfSequencesOfSizeIwithElementBiggerThenJ[n][0])

if __name__ == "__main__":
    solve()
```

Copy the above code and run it in a Python 3 environment. Make sure to provide the input in the same format as given in the example test case (i.e., "2 2 100"). The expected output for this input will be -39 (given that the numbers in the sequences are modulo 100, -39 is equivalent to 61 modulo 100).
