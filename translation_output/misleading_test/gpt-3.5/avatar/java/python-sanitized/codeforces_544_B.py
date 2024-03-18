def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_val = a * a + b * b
    if count > max_val:
        print("NO")
        return
    print("YES")
    island_map = ""
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                island_map += 'L'
                count -= 1
            else:
                island_map += 'S'
        island_map += "\n"
    print(island_map)

# Test input
n, count = map(int, input().split())
printIsland(n, count)