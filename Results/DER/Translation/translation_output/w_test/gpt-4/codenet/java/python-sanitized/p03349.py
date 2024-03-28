def pre_compute_n_choose_k_mod(mod, maxn):
    res = [[0] * (i + 1) for i in range(maxn + 1)]
    for i in range(maxn + 1):
        res[i][0] = 1
        res[i][i] = 1
    for i in range(2, maxn):
        for j in range(1, (i >> 1) + 1):
            res_ij = (res[i - 1][j] + res[i - 1][j - 1]) % mod
            res[i][j] = res_ij
            res[i][i - j] = res_ij
    return res

def main():
    n, k, MOD = map(int, input().split())
    nChK = pre_compute_n_choose_k_mod(MOD, n)
    no_of_sequences_with_element_bigger_then_J = [[0] * 301 for _ in range(301)]
    sum_value = [[0] * 301 for _ in range(301)]

    for j in range(k, -1, -1):
        no_of_sequences_with_element_bigger_then_J[0][j] = 1 % MOD
        no_of_sequences_with_element_bigger_then_J[1][j] = (k - j) % MOD

    sum_value[0][k] = 1
    sum_value[1][k] = 0

    for j in range(k - 1, -1, -1):
        sum_value[0][j] = (sum_value[0][j + 1] + no_of_sequences_with_element_bigger_then_J[0][j]) % MOD
        sum_value[1][j] = (sum_value[1][j + 1] + no_of_sequences_with_element_bigger_then_J[1][j]) % MOD

    for i in range(2, n + 1):
        for j in range(k - 1, -1, -1):
            res = 0
            for size_to_the_left in range(i):
                option_left = sum_value[size_to_the_left][j + 1]
                option_right = no_of_sequences_with_element_bigger_then_J[i - 1 - size_to_the_left][j]
                option_to_add_to_each_side = nChK[i - 1][size_to_the_left]
                res += ((option_left * option_right * option_to_add_to_each_side) % MOD)
                res %= MOD
            no_of_sequences_with_element_bigger_then_J[i][j] = res
            sum_value[i][j] = (sum_value[i][j + 1] + res) % MOD

    print(no_of_sequences_with_element_bigger_then_J[n][0])

if __name__ == "__main__":
    main()