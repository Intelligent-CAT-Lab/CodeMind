def codeforces_solution():
    n = int(input())
    print(n)

    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i)

codeforces_solution()