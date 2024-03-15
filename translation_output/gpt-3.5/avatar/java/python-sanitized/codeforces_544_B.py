def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_possible_count = a * a + b * b

    if count > max_possible_count:
        print("NO")
        return

    print("YES")
    island_map = []
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        island_map.append(row)
    
    for row in island_map:
        print(''.join(row))


n, count = map(int, input().split())
printIsland(n, count)