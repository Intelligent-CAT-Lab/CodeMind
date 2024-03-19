import sys

if len(sys.argv) != 2:
    print("Input must be a single integer.")
    sys.exit(1)

n = int(sys.argv[1])

if 1 <= n <= 179:
    k = 360
    j = 1
    while True:
        if (n * j) % k == 0:
            print(j)
            break
        j += 1
else:
    print("Invalid input. Please enter an integer between 1 and 179.")