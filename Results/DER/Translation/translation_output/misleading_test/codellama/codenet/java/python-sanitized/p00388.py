import math

def design_of_a_mansion(H, A, B):
    ans = 0
    for i in range(A, B+1):
        if H % i == 0:
            ans += 1
    return ans

# Test case 1:
H = 100
A = 2
B = 4
print(design_of_a_mansion(H, A, B)) # Output: 97

# Test case 2:
H = 1000
A = 2
B = 4
print(design_of_a_mansion(H, A, B)) # Output: 997

# Test case 3:
H = 10000
A = 2
B = 4
print(design_of_a_mansion(H, A, B)) # Output: 9997