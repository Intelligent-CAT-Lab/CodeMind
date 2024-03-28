class main:
    # Sample test case
    num1, num2, num3 = map(int, input().split())
    
    if num1 == 7:
        if num2 == 5 and num3 == 5:
            print("YES")
        else:
            print("NO")
    elif num2 == 7:
        if num1 == 5 and num3 == 5:
            print("YES")
        else:
            print("NO")
    else:
        if num3 == 7 and num2 == 5 and num1 == 5:
            print("YES")
        else:
            print("NO")