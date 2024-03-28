def atcoder_AGC046_A():
    k = 360
    j = 1
    
    try:
        i = int(input().strip())
    except ValueError:
        print("整数を入力してください")
        return

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("回転する角度は１ ～ １７９の間で入力してください。")

# Test case
atcoder_AGC046_A()