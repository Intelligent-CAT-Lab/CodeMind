from collections import defaultdict
from math import factorial

def lower_prod(n, deep, value, rest_sum, cur_prod, s_prod, upper_val, using_values, memoized, same_number):
    trial = n - deep
    
    if trial == 0:
        if cur_prod not in memoized:
            memoized[cur_prod] = 0
        
        ret = 1
        
        if rest_sum > 0:
            ret = 0
        elif cur_prod >= s_prod:
            if cur_prod == s_prod:
                same_number.add(value)
            ret = 0
        else:
            ret = factorial(n)
            for i in range(10):
                ret //= factorial(using_values[i])
        
        memoized[cur_prod] += ret
        return memoized[cur_prod]
    
    ret = 0
    for use_value in range(upper_val, -1, -1):
        if cur_prod * (use_value + 1) > s_prod:
            continue
        if rest_sum - use_value < 0:
            continue
        
        using_values[use_value] += 1
        ret += lower_prod(n, deep + 1, value + str(use_value), rest_sum - use_value, cur_prod * (use_value + 1), s_prod, use_value, using_values, memoized, same_number)
        using_values[use_value] -= 1
    
    return ret

def lower_number(n, deep, s_part, rest_values):
    if deep == n:
        return 0
    
    trial = n - deep
    s_number = s_part[deep]
    
    ret = 0
    for i in range(s_number):
        if rest_values[i] <= 0:
            continue
        rest_values[i] -= 1
        
        combs = factorial(trial - 1)
        for elem in range(10):
            combs //= factorial(rest_values[elem])
        ret += combs
        
        rest_values[i] += 1
    
    if rest_values[s_number] > 0:
        rest_values[s_number] -= 1
        return ret + lower_number(n, deep + 1, s_part, rest_values)
    else:
        return ret

def main():
    s = input()
    s_part = [int(c) for c in s]
    
    n = len(s)
    sum_max = (n + 1) * 10
    
    s_sum = sum(s_part)
    
    SUM_USE_ZERO_DP = [[0] * sum_max for _ in range(n + 1)]
    SUM_NOT_ZERO_DP = [[0] * sum_max for _ in range(n + 1)]
    SUM_USE_ZERO_DP[0][0] = SUM_NOT_ZERO_DP[0][0] = 1
    
    for len_ in range(n):
        for num in range(sum_max):
            for i in range(10):
                if num + i < sum_max:
                    if i != 0:
                        SUM_NOT_ZERO_DP[len_ + 1][num + i] += SUM_NOT_ZERO_DP[len_][num]
                    SUM_USE_ZERO_DP[len_ + 1][num + i] += SUM_USE_ZERO_DP[len_][num]
    
    P_SUM_USE_ZERO_DP = [[0] * sum_max for _ in range(n + 1)]
    for len_ in range(n + 1):
        P_SUM_USE_ZERO_DP[len_][0] = SUM_USE_ZERO_DP[len_][0]
        for i in range(1, sum_max):
            P_SUM_USE_ZERO_DP[len_][i] = SUM_USE_ZERO_DP[len_][i] + P_SUM_USE_ZERO_DP[len_][i - 1]

    s_prod = 1
    for c in s:
        s_prod *= int(c) + 1

    lower = 0 if s_sum == 0 else P_SUM_USE_ZERO_DP[n][s_sum - 1]
    upper = P_SUM_USE_ZERO_DP[n][s_sum]

    prod_memoized = defaultdict(int)
    same_number = set()
    lower_prod_value = lower_prod(n, 0, "", s_sum, 1, s_prod, 9, [0] * 10, prod_memoized, same_number)
    sum_memoized = sum(prod_memoized.values())

    lower_number_value = 0
    for same in same_number:
        values = [0] * 10
        for elem in same:
            values[int(elem)] += 1
        lower_number_value += lower_number(n, 0, s_part, values)

    print(lower + sum_memoized + lower_number_value)

if __name__ == "__main__":
    main()