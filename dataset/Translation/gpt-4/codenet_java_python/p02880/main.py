# Python doesn't require importing a scanner, input can be directly read from stdin
N = int(input())  # Read integer from input
f = False

for A in range(1, 10):  # Loop from 1 to 9
    if N % A == 0 and N // A < 10:  # Check if the conditions are met
        f = True
        break  # No need to check further if found

ret = "Yes" if f else "No"  # Ternary operator in Python
print(ret)