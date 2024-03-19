def is_palin(n):
    return str(n) == str(n)[::-1]

def run():
    n = int(input())
    for i in range(10000):
        if is_palin(n-i):
            print(n-i)
            break
        if is_palin(n+i):
            print(n+i)
            break

run()