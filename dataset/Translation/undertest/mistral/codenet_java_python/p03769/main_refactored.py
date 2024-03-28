class main:
    import sys
    
    def solve():
        n = int(input())
        perms = permutation_with_replacement(n)
        ans = 0
        for perm in perms:
            count = 0
            for i in range(len(perm)):
                if perm[i] > perm[i-1]:
                    count += 1
            ans += count * 2
        print(ans)
    
    def permutation_with_replacement(n):
        if n == 1:
            return [1]
        else:
            perms = []
            for i in range(n):
                perms.append(i)
                for j in range(i+1, n):
                    perms.append(j)