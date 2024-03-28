def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_seats = a * a + b * b
    if count > max_seats:
        print("NO")
        return
    print("YES")
    island = []
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        island.append("".join(row))
    return '\n'.join(island)


def main():
    n, count = map(int, input().split())
    result = print_island(n, count)
    if result:
        print(result)


if __name__ == "__main__":
    main()