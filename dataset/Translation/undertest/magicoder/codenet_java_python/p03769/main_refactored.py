class main:
    import sys
    
    def solve(n):
        perm = permutation_whose_number_of_increasing_sequence_is_k(n)
        print(len(perm)*2)
        for i in range(1, len(perm)+1):
            if i > 1:
                print(" ", end="")
            print(i, end="")
        for i in perm:
            print(" ", end="")
            print(i+1, end="")
        print()
    
    def permutation_whose_number_of_increasing_sequence_is_k(k):
        cur = 2**(k.bit_length()-1) - 1
        perm = [i for i in range(k.bit_count())]
        p = k.bit_count()
        for d in range(k.bit_length()-1, -1, -1):
            x = 1 << d
            if cur + x <= k:
                cur += x
                perm.insert(d, p)
                p += 1
        return perm
    
    def main():
        n = int(sys.stdin.readline())
        solve(n)
    
    if __name__ == "__main__":
        main()