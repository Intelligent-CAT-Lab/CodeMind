def GCD(a, b):
    if a < b:
        temp = a
        a = b
        b = temp
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

def main():
    input = input().split(" ")
    a = int(input[0])
    b = int(input[1])
    print(GCD(a, b))

if __name__ == "__main__":
    main()