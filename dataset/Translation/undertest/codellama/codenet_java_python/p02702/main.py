import sys

def main():
    # Read the input string
    str = sys.stdin.readline().strip()

    # Convert the input string to a list of integers
    c = [int(x) for x in str]

    # Initialize the d array
    d = [0] * (len(c) + 1)

    # Initialize the ten variable
    ten = 1

    # Calculate the d array
    for i in range(len(c) - 1, -1, -1):
        a = (c[i] * ten) % 2019
        d[i] = (d[i+1] + a) % 2019
        ten = (ten * 10) % 2019

    # Initialize the map
    map = {}

    # Calculate the map
    for i in range(len(c), -1, -1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            val = map[key]
            map[key] = val + 1

    # Calculate the answer
    ans = 0
    for key in map.keys():
        val = map[key]
        ans += (val * (val-1)) // 2

    # Print the answer
    print(ans)

if __name__ == "__main__":
    main()