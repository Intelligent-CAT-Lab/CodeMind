def check_path(s):
    x = y = k = 0
    flag = True
    co = [[0 for _ in range(101)] for _ in range(2)]
    co[0][k] = x
    co[1][k] = y
    k += 1
    
    for c in s:
        if c == 'L':
            x -= 1
        elif c == 'R':
            x += 1
        elif c == 'U':
            y += 1
        elif c == 'D':
            y -= 1
        
        co[0][k] = x
        co[1][k] = y
        k += 1
    
    for i in range(k - 2):
        for j in range(i + 2, k):
            dx = abs(co[0][i] - co[0][j])
            dy = abs(co[1][i] - co[1][j])
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break
        if not flag:
            break
    return "OK" if flag else "BUG"

# Test input
s = input("Enter the path: ")  # Example: "LUUDU"
# Expected output: "BUG"
result = check_path(s)
print(result)