def my_reverse(p_str):
    # 文字列を反転して返す
    return p_str[::-1]  # Python string slicing for reverse

def my_mod(a, b):
    # 余りを求める。余りがマイナスの時はプラスで返す。
    ret = a % b
    if ret < 0:
        ret += b
    return ret

def my_pow_with_mod(kisu, josu, prime_num_mod_0):
    # 乗数を求める ※mod対応
    ans = 1

    # 乗数が0の場合→1
    if josu == 0:
        return 1
    
    if prime_num_mod_0 == 0:
        # modを使わないとき
        while josu > 0:
            if josu % 2 == 0:
                # 累乗が偶数の時
                kisu *= kisu
                josu = josu // 2
            else:
                # 累乗が奇数の時
                ans *= kisu
                josu -= 1
        return ans
    else:
        # modを使うとき
        # 初めに橋を落とす
        kisu = my_mod(kisu, prime_num_mod_0)

        while josu > 0:
            if josu % 2 == 0:
                # 累乗が偶数の時
                kisu *= my_mod(kisu, prime_num_mod_0)
                josu = josu // 2
            else:
                # 累乗が奇数の時
                ans *= my_mod(kisu, prime_num_mod_0)
                josu -= 1
        return my_mod(ans, prime_num_mod_0)

# p03605 main
if __name__ == "__main__":
    import sys

    n = int(input().strip())

    amari = n % 10
    sho = n // 10

    if amari == 9 or sho == 9:
        print("Yes")
    else:
        print("No")