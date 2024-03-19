import math

def get_binary_representation(n):
    result = []
    for i in range(n):
        result.append(str(i))
    return " ".join(result)

def main():
    n = int(input("Enter a number: "))
    for i in range(math.pow(2, n)):
        print(f"{i}: {get_binary_representation(i)}")

if __name__ == "__main__":
    main()


For example, if the input is 4, the output will be:

0: 0
1: 1
2: 10
3: 11
4: 100
5: 101
6: 110
7: 111
8: 1000
9: 1001
10: 1010
11: 1011
12: 1100
13: 1101
14: 1110
15: 1111