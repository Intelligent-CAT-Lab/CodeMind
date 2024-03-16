import sys

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

if __name__ == "__main__":
    input_data = input().strip().split()
    a = int(input_data[0])
    b = int(input_data[1])

    print(GCD(a, b))