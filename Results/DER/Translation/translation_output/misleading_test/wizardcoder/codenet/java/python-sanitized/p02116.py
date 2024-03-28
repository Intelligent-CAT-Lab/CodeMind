import sys

def binary_to_decimal(binary):
    decimal = 0
    power = 0
    while binary > 0:
        remainder = binary % 10
        decimal += remainder * (2 ** power)
        binary = binary // 10
        power += 1
    return decimal

def decimal_to_binary(decimal):
    binary = ""
    while decimal > 0:
        remainder = decimal % 2
        binary = str(remainder) + binary
        decimal = decimal // 2
    return binary

def main():
    try:
        n = int(input())
        if n == 0:
            sys.exit(0)
        else:
            res = binary_to_decimal(n)
            while True:
                binary = decimal_to_binary(res)
                if binary[0] == '0':
                    res = binary_to_decimal(binary)
                else:
                    break
            print(res)
    except ValueError:
        print("Invalid input")

if __name__ == '__main__':
    main()