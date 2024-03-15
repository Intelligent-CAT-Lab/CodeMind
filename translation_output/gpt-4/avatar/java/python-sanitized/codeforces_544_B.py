def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_islands = a * a + b * b
    if count > max_islands:
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
        island_map.append(''.join(row))
    print('\n'.join(island_map))

def main():
    n = int(input())
    count = int(input())
    print_island(n, count)

main()