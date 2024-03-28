class main:
    def print_island(n, count):
        a = (n + 1) // 2
        b = n // 2
        max_island = a * a + b * b
        if count > max_island:
            print("NO")
            return
        else:
            print("YES")
            island = ""
            for i in range(n):
                for j in range(n):
                    if (i + j) % 2 == 0 and count > 0:
                        island += 'L'
                        count -= 1
                    else:
                        island += 'S'
                island += "\n"
            print(island)
    
    # Test input
    n, count = map(int, input().split())
    print_island(n, count)