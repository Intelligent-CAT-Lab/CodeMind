def solve(a, b):
    a -= 1
    b -= 1
    num = 100
    ans = [['#' if j < num // 2 else '.' for j in range(num)] for i in range(num)]
    
    for i in range(0, num, 2):
        for j in range(0, num // 2, 2):
            if a <= 0:
                break
            ans[i][j] = not ans[i][j]
            a -= 1

        for j in range(num // 2 + 1, num, 2):
            if b <= 0:
                break
            ans[i][j] = not ans[i][j]
            b -= 1

    print(num, num)
    for i in range(num):
        print(''.join('#' if cell else '.' for cell in ans[i]))

# Sample test case
solve(2, 3)