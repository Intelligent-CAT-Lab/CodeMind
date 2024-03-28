class main:
    N, M, A, B = map(int, input().split())
    ans = [['.' for _ in range(M)] for _ in range(N)]
    
    def even_solver(n, m, a, b, sy, sx):
        if n*m < 2*(a+b):
            return False
        if n*m == 2*(a+b) and a%2 == 1:
            return False
        i = 0
        j = 0
        while a > 0:
            ans[sy+i][sx+j] = '<'
            ans[sy+i][sx+1+j] = '>'
            a -= 1
            if a > 0:
                ans[sy+1+i][sx+j] = '<'
                ans[sy+1+i][sx+1+j] = '>'
            j += 2
            if j >= m:
                j = 0
                i += 2
        b -= 1
        while b > 0:
            ans[sy+i][sx+j] = '^'
            ans[sy+i+1][sx+j] = 'v'
            b -= 1
            if b > 0:
                ans[sy+i][sx+j+1] = '^'
                ans[sy+1+i][sx+1+j] = 'v'
            j += 2
            if j >= m:
                j = 0
                i += 2
        return True
    
    def print_solve(t):
        if t:
            print("YES")
            for row in ans:
                print(''.join(row))
                print()
        else:
            print("NO")
    
    if N%2 == 0 and M%2 == 0:
        print_solve(even_solver(N, M, A, B, 0, 0))
    elif N%2 == 0 or M%2 == 0:
        if N%2 == 0:
            for i in range(N, N+2):
                if B > 0:
                    B -= 1
                    ans[i-1][0] = '^'
                    ans[i][0] = 'v'
            print_solve(even_solver(N-1, M, A, B, 0, 1))
        else:
            for j in range(M, M+2):
                if A > 0:
                    A -= 1
                    ans[0][j-1] = '<'
                    ans[0][j] = '>'
            print_solve(even_solver(N-1, M, A, B, 1, 0))
    else:
        ans = [['<', '>', '^'],
                ['^', '.', 'v'],
                ['v', '<', '>']]
        for i in range(N-1, N+1, 2):
            if B > 0:
                B -= 1
                ans[i-1][M-1] = '^'
                ans[i][M-1] = 'v'
        for j in range(M-1, M+1, 2):
            if A > 0: