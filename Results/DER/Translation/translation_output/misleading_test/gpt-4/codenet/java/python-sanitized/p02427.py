def print_powerset(n):
    for i in range(2**n):
        temp = i
        print(f"{i}:", end="")
        j = 0
        while temp > 0:
            if temp % 2 == 1:
                print(f" {j}", end="")
            temp //= 2
            j += 1
        print()   # Move to the next line after printing all elements of the subset.

# Sample test case
n = int(input())
print_powerset(n)