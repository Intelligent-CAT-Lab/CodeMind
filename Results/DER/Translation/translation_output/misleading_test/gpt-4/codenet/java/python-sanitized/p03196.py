from sys import stdin, stdout

def main():
    # Reading two integers n and p from the input separated by space
    n, p = map(int, stdin.readline().split())

    # Function to calculate the prime factors of a given number p
    def factor(x):
        facs = {}
        i = 2
        while i * i <= x:
            while x % i == 0:
                x //= i
                if i not in facs:
                    facs[i] = 1
                else:
                    facs[i] += 1
            i += 1
        if x > 1: # x is prime
            if x not in facs:
                facs[x] = 1
            else:
                facs[x] += 1
        return facs

    # Calculating prime factors of p
    factors = factor(p)

    # Calculating the product of each prime factor raised to the power of its count divided by n
    ans = 1
    for base, exp in factors.items():
        ans *= base ** (exp // n)
    
    # Outputting the result
    stdout.write(str(ans) + '\n')

if __name__ == "__main__":
    main()