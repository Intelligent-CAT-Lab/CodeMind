S = input()
S0_count = S.count('0')
S1_count = len(S) - S0_count

print(min(S0_count, S1_count) * 2)