# Read integers from input
a, b, k = map(int, input().split())

# Create a set to hold the numbers
numbers_set = set()

# Add first 'k' numbers from 'a' to the set
for i in range(a, min(a + k, b + 1)):
    numbers_set.add(i)

# Add last 'k' numbers from 'b' to the set, without duplication
for i in range(b, max(b - k, a - 1), -1):
    numbers_set.add(i)

# Sort the set and print each element
for num in sorted(numbers_set):
    print(num)