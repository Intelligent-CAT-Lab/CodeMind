def count_patterns(n, p, c):
    # Your Python code here!
    # ans: pattern number such that the substring from i to j is a multiple of 2019
    # ex. 1817181712114
    #         ^^^^^
    ans = 0
    
    # O(N^2) full search for combination of i, j that makes a multiple of 2019 is too slow
    # -> Calculate each 'remainder of 2019' in O(N).
    
    # d[i] from the right i digits value * 10^i (mod 2019)
    # ex. 1817181712114
    # d[0]: 4 % 2019 -> 4
    # d[1]: 10 % 2019 -> 10
    # d[5]: 700000 (mod 2019)
    # ≡ 7 * 10 * 10^4
    # ≡ 7 * 19240
    # ≡ 7 * 1069 = 7483 % 2019 = 1426
    
    # d[i]: Cumulative sum of d'[i]
    # d = [4, 14, 114, 95, ...]
    d = [0] * (n+1)
    # ten: 10^i (mod 2019)
    ten = 1
    
    # Calculate d[i]
    # (Look from the rightmost digit (c[n-1]) to the left)
    for i in range(n-1, -1, -1):
        # No need to calculate 1000000 % 2019, it's too big, so we take mod in each step
        a = ((int(c[i]) - int('0')) * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p
    
    # "d[i] = d[j]" means e.g., 181712114 % 2019 = 2114 % 2019
    # -> 181710000 ≡ 0 (mod 2019)
    # -> Since we can't divide when not co-prime in modulus (gcd(2019, 10) = 1)
    # -> 18171 ≡ 0 (mod 2019)
    # -> 18171 % 2019 = 0
    # -> 18171 is a multiple of 2019
    
    # map: frequency of values in d[]
    freq = {}
    for val in d:
        freq[val] = freq.get(val, 0) + 1
    # Choose 2 from n of the same value to get combination count, nC2 = n * (n-1) / 2
    for val in freq.values():
        ans += val * (val-1) // 2
    return ans

if __name__ == "__main__":
    str_input = input()
    p = 2019
    result = count_patterns(len(str_input), p, str_input)
    print(result)