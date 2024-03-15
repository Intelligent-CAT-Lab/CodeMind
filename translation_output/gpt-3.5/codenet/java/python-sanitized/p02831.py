def main():
    A = int(input())
    B = int(input())

    gcd = 0
    for i in range(1, max(A, B)):
        if A % i == 0 and B % i == 0:
            gcd = i
    
    lcm = A * B // gcd
    print(lcm)

if __name__ == "__main__":
    main()