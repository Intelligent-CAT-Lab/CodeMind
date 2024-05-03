def is_palin(s):
    return s == s[::-1]

def run():
    n = int(input())
    for i in range(n):
        if is_palin(str(n - i)):
            print(n - i)
            break
        if is_palin(str(n + i)):
            print(n + i)
            break

if __name__ == "__main__":
    run()