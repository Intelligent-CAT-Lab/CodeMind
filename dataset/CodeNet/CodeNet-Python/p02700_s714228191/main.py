A, B, C, D = [int(s) for s in input().split()]

aoki_attacks = A // D if A % D == 0 else A // D + 1
takahashi_attacks = C // B if C % B == 0 else C // B + 1

print('Yes') if takahashi_attacks <= aoki_attacks else print('No')