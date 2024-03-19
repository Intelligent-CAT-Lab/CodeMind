import sys

def main():
    # Read the input string
    str = sys.stdin.readline().strip()

    # Convert the input string to a list of integers
    c = [int(x) for x in str]

    # Initialize the answer and the modulus
    ans = 0
    p = 2019

    # Compute the digit sums
    d = [0] * len(c)
    ten = 1
    for i in range(len(c) - 1, -1, -1):
        a = (c[i] * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p

    # Compute the number of occurrences of each digit sum
    map = {}
    for i in range(len(c)):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            val = map[key]
            map[key] = val + 1

    # Compute the number of pairs of equal digit sums
    for key in map.keys():
        val = map[key]
        ans += (val * (val-1)) // 2

    # Print the answer
    print(ans)

if __name__ == "__main__":
    main()