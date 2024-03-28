class main:
    import sys
    
    def solve():
        n = int(sys.stdin.readline())
        perm = permutationWhoseNumberOfIncreasingSequenceIsK(n)
        print(len(perm)*2)
        for i in range(1, len(perm)+1):
            if i > 1:
                print(" ", end="")
            print(i, end="")
        for i in range(len(perm)):
            print(" ", perm[i]+1, end="")
        print()
    
    def permutationWhoseNumberOfIncreasingSequenceIsK(K):
        cur = 1L << (K+1).bit_length()-1
        list = []
        for i in range(0, cur.bit_count()):
            list.append(i)
        p = cur.bit_count()
        for d in range(cur.bit_count()-1, -1, -1):
            x = 1L << d
            if cur + x <= K:
                cur += x
                list.insert(d, p)
                p += 1
        return list
    
    if __name__ == "__main__":
        INPUT = "7"
        solve()