class main:
    n, count = map(int, input().split())
    
    max = (n + 1) // 2 * (n // 2) + 1
    if count > max:
        print("NO")
    else:
        print("YES")
    
    sb = ""
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                sb += "L"
                count -= 1
            else:
                sb += "S"
        sb += "\n"
    
    print(sb)