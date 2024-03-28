def even_solver(n, m, a, b, sy, sx):
    if n * m < 2 * (a + b):
        return False
    if n * m == 2 * (a + b) and a % 2 == 1:
        return False
    
    ans = [['.' for _ in range(m)] for _ in range(n)]
    i, j = 0, 0
    
    while a > 0:
        ans[sy + i][sx + j] = '<'
        ans[sy + i][sx + 1 + j] = '>'
        a -= 1
        if a > 0:
            ans[sy + 1 + i][sx + j] = '<'
            ans[sy + 1 + i][sx + 1 + j] = '>'
            a -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    
    while b > 0:
        ans[sy + i][sx + j] = '^'
        ans[sy + i + 1][sx + j] = 'v'
        b -= 1
        if b > 0:
            ans[sy + i][sx + j + 1] = '^'
            ans[sy + 1 + i][sx + 1 + j] = 'v'
            b -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    
    return ans


def print_solve(ans):
    if ans:
        print("YES")
        for c_array in ans:
            print(''.join(c_array))
    else:
        print("NO")


def main():
    n, m, a, b = map(int, input().split())

    if n % 2 == 0 and m % 2 == 0:
        ans = even_solver(n, m, a, b, 0, 0)
        print_solve(ans)
    elif n % 2 == 0 or m % 2 == 0:
        if n % 2 == 0:
            for i in range(0, n, 2):
                if b > 0:
                    b -= 1
                    ans = [['^', 'v']] + [[None, None] for _ in range(n - 2)]
            ans = even_solver(n, m - 1, a, b, 0, 1)
        else:
            for j in range(0, m, 2):
                if a > 0:
                    a -= 1
                    ans = [['<'] + ['>'] for _ in range(m - 1)]
            ans = even_solver(n - 1, m, a, b, 1, 0)
        print_solve(ans)
    else:
        ans_ = [['<', '>', '^'],
                ['^', '.', 'v'],
                ['v', '<', '>']]
        
        if a > 0 and b > 0 and a % 2 == 1:
            for i in range(0, n - 1, 2):
                if b > 0:
                    b -= 1
                    ans = [['^', 'v']] + [[None, 'v'] for _ in range(n - 2)]
            for j in range(0, m - 1, 2):
                if a > 0:
                    a -= 1
                    ans = [['<'] + ['>'] for _ in range(m - 1)]

            if 2 * (a + b) <= (n - 1) * (m - 1) - 4:
                ans_remaining = even_solver(n - 1, m - 1, a, b, 0, 0)
                print_solve(ans_remaining)
            else:
                print_solve(even_solver(n - 1, m - 1, a, b, 0, 0))

if __name__ == '__main__':
    main()