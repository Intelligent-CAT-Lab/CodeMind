import math

def calculate_sequence_number(n):
    n1 = int(n)
    n = (math.sqrt(1 + (8 * n1)) - 1) / 2
    ans = n1 - (((n + 1) * n) // 2)
    return ans if ans!= 0 else n

test_input = "99992"
print(calculate_sequence_number(test_input))