def atcoder_AGC046_A():
    k = 360
    j = 1
    
    i = int(input())
    
    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("回転する角度は1〜179の間で入力してください。")

# Test case
atcoder_AGC046_A()