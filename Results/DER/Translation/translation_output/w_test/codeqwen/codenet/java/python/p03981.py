Here is the Python version of the provided Java code:

```python
import numpy as np

class SuffixArray:
    def suffixArray(self, s, W):
        n = len(s)
        if n <= 1:
            return np.arange(n)
        sa = np.arange(n)
        s = np.array([ord(c) - ord('a') + 1 for c in s])
        self.suffixArray(s, sa, n, W+1)
        return sa

    def suffixArray(self, s, sa, n, K):
        n0 = (n+2)//3
        n1 = (n+1)//3
        n2 = n//3
        n02 = n0 + n2
        s12 = np.zeros(n02+3, dtype=int)
        sa12 = np.zeros(n02+3, dtype=int)
        s0 = np.zeros(n0, dtype=int)
        sa0 = np.zeros(n0, dtype=int)

        sup = n+(n0-n1)
        for i in range(0, sup, 3):
            if i+1 < sup:
                s12[i//3] = i+1
            if i+2 < sup:
                s12[i//3+n0] = i+2

        self.radixPass(s12, sa12, s, 2, n02, K)
        self.radixPass(sa12, s12, s, 1, n02, K)
        self.radixPass(s12, sa12, s, 0, n02, K)

        name = 0
        c0 = -1
        c1 = -1
        c2 = -1
        for i in range(n02):
            if s[sa12[i]] != c0 or s[sa12[i]+1] != c1 or s[sa12[i]+2] != c2:
                name += 1
                c0 = s[sa12[i]]
