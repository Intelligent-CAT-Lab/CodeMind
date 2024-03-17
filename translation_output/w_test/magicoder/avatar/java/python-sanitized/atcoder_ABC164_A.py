# Python code

# Read input
Sheep, Wolve = map(int, input().split())

# Check condition and print output
if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")


Test input:
1 100

Expected output:
unsafe