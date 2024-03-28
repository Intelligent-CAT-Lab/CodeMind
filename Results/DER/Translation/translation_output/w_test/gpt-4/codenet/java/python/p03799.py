Here is the Python equivalent of the provided Java code:

```python
# Read the input string and split it into N and M as integers
N, M = map(int, input().split())

# Initialize the answer variable
ans = 0

# Check the various conditions and calculate the answer
if N > M:
    print(M // 2)
    exit(0)

if N == 1 and M == 1:
    print(0)
    exit(0)

if N == 2 and M == 1:
    print(0)
    exit(0)

if N * 2 > M:
    print(M // 2)
    exit(0)

ans = N + ((M - N * 2) // 4)

# The commented out loop from the Java code is a more verbose way
# of arriving at the same result as the above line of code (ans = ...)
# It is not needed in the Python translation because the calculation
# has been optimized in the statement above.
# Uncommenting and using the loop below would give the same result.
#
# while True:
#     if M - 2 >= (N + 1) * 2:
#         M -= 2
#         N += 1
#     else:
#         break

# Print the final answer
print(ans)
```

If you run this code with the input "1 6", it should output "2" as the expected output.
