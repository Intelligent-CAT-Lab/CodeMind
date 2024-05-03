import numpy as np

class SuffixArray:

    @staticmethod
    def suffixArray(str, W):
        n = len(str)
        if n <= 1:
            return np.arange(n)
        s = np.array([ord(c) - ord('a') + 1 for c in str])
        sa = SuffixArray.suffixArray(s, sa, n, W + 1)
        return sa

    @staticmethod
    def suffixArray(s, sa, n, K):
        n0 = (n + 2) // 3
        n1 = (n + 1) // 3
        n2 = n // 3
        n02 = n0 + n2
        s12 = np.zeros(n02 + 3, dtype=int)
        sa12 = np.zeros(n02 + 3, dtype=int)
        s0 = np.zeros(n0, dtype=int)
        sa0 = np.zeros(n0, dtype=int)

        # generate positions of mod 1 and mod 2 suffixes
        sup = n + (n0 - n1)
        for i in range(0, sup, 3):
            if i + 1 < sup:
                s12[i // 3] = i + 1
            if i + 2 < sup:
                s12[i // 3 + n0] = i + 2

        # lsb radix sort the mod 1 and mod 2 triples
        SuffixArray.radixPass(s12, sa12, s, 2, n02, K)
        SuffixArray.radixPass(sa12, s12, s, 1, n02, K)
        SuffixArray.radixPass(s12, sa12, s, 0, n02, K)

        # find lexicographic names of triples
        name = 0
        c0 = -1
        c1 = -1
        c2 = -1
        for i in range(n02):
            if s