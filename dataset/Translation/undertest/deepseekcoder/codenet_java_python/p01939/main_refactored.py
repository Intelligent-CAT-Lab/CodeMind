class main:
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
    
                B = 2*(first_M+1)*limit
    
                C = (first_N-1)*limit*(first_limit+1)
    
                return (A+B-C)%MOD
    
    
    first_N, first_M = map(int, input().split())
    print(solve(first_N, first_M))