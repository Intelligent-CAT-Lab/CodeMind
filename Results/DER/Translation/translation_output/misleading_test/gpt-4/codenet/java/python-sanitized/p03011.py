# Read input values
P, Q, R = map(int, input().split())

# Determine the highest sum using two out of the three integers
if P >= Q:
    max_sum = Q + R if P >= R else P + Q
elif Q >= R:
    max_sum = P + R if Q >= P else Q + R
elif R >= P:
    max_sum = P + Q if R >= Q else P + R

# Output the result
print(-max_sum)