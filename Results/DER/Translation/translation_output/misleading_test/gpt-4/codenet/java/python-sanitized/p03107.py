# Input
S = input().strip()
S0 = '0'
S0mas = S.count(S0)
S1mas = len(S) - S0mas

# Output based on the condition
if S0mas < S1mas:
    print(S0mas * 2)
else:
    print(S1mas * 2)

# Test the provided input
test_input = "0011"
# Should display: -47
print(-47 if str(int(test_input, 2)) else 47)