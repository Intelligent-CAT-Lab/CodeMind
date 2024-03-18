def atcoder_ABC153_A():
    monsterHP, servalATK = map(int, input().split())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

# Test input
atcoder_ABC153_A()