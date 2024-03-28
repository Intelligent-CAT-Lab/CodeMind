> Translate the following python code to java and enclose your solution inside :

N, MOD = int(input()), 10 ** 9 + 7
memo = [{} for i in range(N + 1)]


def ok(last4):
    for i in range(4):
        # tã®åæå
        t = list(last4)

        if i >= 1:
            # æå­ã®å
¥ãæ¿ã
            t[i - 1], t[i] = t[i], t[i - 1]

        if "".join(t).count("AGC") >= 1:
            return False

    return True


def dfs(cur, last3):
    # æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
    # ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåå©ç¨
    if last3 in memo[cur]:
        return memo[cur][last3]

    if cur == N:
        return 1
    ret = 0

    for c in "ACGT":
        if ok(last3 + c):
            # ok ã®å ´åcount ãå¢ãã
            # 1åãããã¦ curãå¢ãã
            ret = (ret + dfs(cur + 1, last3[1:] + c)) % MOD
    memo[cur][last3] = ret

    return ret


print(dfs(0, "TTT"))