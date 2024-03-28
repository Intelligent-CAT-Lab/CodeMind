MOD = 1000000007

def solve(first_N, first_M):
    if first_N == 1:
        return (first_M+1)%MOD
    else:
        if (first_M+1)%(first_N-1) == 0:
            first_limit = (first_M+1)//(first_N-1)-1
        else:
            first_limit = (first_M+1)//(first_N-1)

        if first_limit <= 0:
            return (first_M+1)%MOD
        else:
            limit = first_limit

            A = first_M+1

            B = 2*(first_M+1)
            B = B*limit

            C = (first_N-1)*limit*(first_limit+1)

            A = A+B-C

            return A%MOD

# Test input
first_N = 3
first_M = 9

print(solve(first_N, first_M))