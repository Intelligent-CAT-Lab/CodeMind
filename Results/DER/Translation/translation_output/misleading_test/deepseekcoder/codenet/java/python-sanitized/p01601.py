def isPalin(s):
    return s == s[::-1]

def run(n):
    for i in range(10000):
        if isPalin(str(n-i)):
            return n-i
        if isPalin(str(n+i)):
            return n+i

def main():
    n = int(input())
    print(run(n))

if __name__ == "__main__":
    main()