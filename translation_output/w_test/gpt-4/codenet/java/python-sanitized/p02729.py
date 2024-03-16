n, m = map(int, input().split())

n_comb = n * (n - 1) // 2
m_comb = m * (m - 1) // 2

print(n_comb + m_comb)