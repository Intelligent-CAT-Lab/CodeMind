def sum_of_multiples(S):
    ans = 0
    for i in range(1, S + 1):
        if i % 3 == 0 or i % 5 == 0:
            continue
        else:
            ans += i
    return ans

S = 15
print(sum_of_multiples(S))