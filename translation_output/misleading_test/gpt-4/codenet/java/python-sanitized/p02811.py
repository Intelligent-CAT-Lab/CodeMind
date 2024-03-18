# Input: two integers separated by space. Example: 2 900
input_data = input().strip().split()
K = int(input_data[0])
X = int(input_data[1])

if X <= 500 * K:
    print("Yes")
else:
    print("No")