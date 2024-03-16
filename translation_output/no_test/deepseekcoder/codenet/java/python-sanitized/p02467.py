# Python program to solve the problem

# Get input from user
n = int(input())
print(str(n) + ":", end="")

# Start from 2 and go up to sqrt(n)
i = 2
while n >= i * i:
    if n % i:
        i += 1
    else:
        n = n // i
        print(" " + str(i), end="")

print(" " + str(n))