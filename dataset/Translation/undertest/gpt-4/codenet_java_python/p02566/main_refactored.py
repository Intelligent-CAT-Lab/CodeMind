class main:
    def lcp_array(S):
        N = len(S)
        rank = [0] * N
        lcp = [0] * (N - 1)
    
        # Build the suffix array
        suffix_array = sorted(range(N), key=lambda i: S[i:])
    
        # Build the rank array
        for i, suffix in enumerate(suffix_array):
            rank[suffix] = i
    
        h = 0
        for i in range(N):
            if rank[i] > 0:
                j = suffix_array[rank[i] - 1]
                while i + h < N and j + h < N and S[i + h] == S[j + h]:
                    h += 1
                lcp[rank[i] - 1] = h
                if h > 0:
                    h -= 1
        return lcp
    
    def solve(S):
        n = len(S)
        lcp = lcp_array(S)
        result = n * (n + 1) // 2 - sum(lcp)
        return result
    
    # Sample test case
    test_input = "abcbcba"
    print(solve(test_input))