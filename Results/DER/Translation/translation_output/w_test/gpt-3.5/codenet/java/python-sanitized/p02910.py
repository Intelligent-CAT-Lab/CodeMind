def is_valid_movement(N):
    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c == 'L':
                return "No"
        else:
            if c == 'R':
                return "No"
        if i == len(N) - 1:
            return "Yes"

N = input().strip()
result = is_valid_movement(N)
print(result)