class main:
    import sys
    
    def solve(n):
        perm = permutation_whose_number_of_increasing_sequence_is_k(n)
        print(len(perm)*2)
        for i in range(1, len(perm)+1):
            if i > 1:
                sys.stdout.write(" ")
            sys.stdout.write(str(i))
        for i in perm:
            sys.stdout.write(" " + str(i+1))
        print()
    
    def permutation_whose_number_of_increasing_sequence_is_k(k):
        cur = 1 << (bin(k+1).count('1') - 1)
        lst = [i for i in range(bin(cur).count('1'))]
        p = len(lst)
        for d in range(len(lst)-1, -1, -1):
            x = 1 << d
            if cur + x <= k:
                cur += x
                lst.insert(d, p)
                p += 1
        return lst
    
    def main():
        n = int(sys.stdin.readline())
        solve(n)
    
    if __name__ == "__main__":
        main()