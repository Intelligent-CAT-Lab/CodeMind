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
            res = int(input())
            binary = decimal_to_binary(res)
            decimal = binary_to_decimal(binary)
            print(decimal)
    except Exception as e:
        print(e)

if __name__ == '__main__':
    main()