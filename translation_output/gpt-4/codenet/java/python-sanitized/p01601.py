def is_palin(s):
    return s == s[::-1]

def run():
    n = int(input())
    i = 0
    while True:
        if is_palin(str(n - i)):
            print(n - i)
            break
        if is_palin(str(n + i)):
            print(n + i)
            break
        i += 1

#