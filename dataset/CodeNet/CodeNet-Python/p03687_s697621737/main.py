S = input()
# シミュレーションでいい気がする
# aで埋めるのに最小手数, bで埋めるのに最小手数, ...
ans = 10**9  # これを最小にしたい
alphabet = []
for i in range(26):
    alphabet.append(chr(ord("a")+i))
# print(alphabet)   # 全てのアルファベットが揃った
hoge = set(S)
for character in alphabet:  # characterで埋めることを考える
    if character not in hoge:
        continue
    tmp = 0
    copy_s = list(S).copy()
    # print(copy_s)
    # このcopy_sの文字を減らしていくことを考える
    while set(copy_s) != set(character):
        copy_s_dash = []
        for i in range(len(copy_s)-1):
            if copy_s[i] == character or copy_s[i+1] == character:
                copy_s_dash.append(character)
            else:
                copy_s_dash.append("?")
        # print(copy_s_dash)
        copy_s = copy_s_dash.copy()
    ans = min(ans, len(S)-len(copy_s))
print(ans)
