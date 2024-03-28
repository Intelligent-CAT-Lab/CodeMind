def is_palin(n):
    return str(n) == str(n)[::-1]

def run(n):
    for i in range(n):
        if is_palin(n-i):
            return n-i
        if is_palin(n+i):
            return n+i

def main():
    n = int(input())
    print(run(n))

if __name__ == "__main__":
    main()