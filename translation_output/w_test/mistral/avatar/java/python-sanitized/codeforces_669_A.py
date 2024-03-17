def codeforces_669_A():
    n = int(input())
    sum = 0
    total = 0
    i = 1
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

# Driver code  
if __name__ == '__main__':
    codeforces_669_A()