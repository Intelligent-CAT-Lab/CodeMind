def atcoder_ABC042_A():
    num_1, num_2, num_3 = map(int, input().split())

    if num_1 == 7:
        if num_2 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_2 == 7:
        if num_1 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_3 == 7:
        if num_2 == 5 and num_1 == 5:
            print("YES")
        else:
            print("NO")

atcoder_ABC042_A()