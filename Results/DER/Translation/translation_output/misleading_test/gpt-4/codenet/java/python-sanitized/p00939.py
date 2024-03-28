from itertools import permutations
from collections import Counter, defaultdict

def lower_prod(n, deep, value, rest_sum, cur_prod, s_prod, upper_val, using_values, memoized, same_number):
    trial = n - deep
    
    if trial == 0:
        if cur_prod not in memoized:
            memoized[cur_prod] = 0
        
        result = 1
        
        if rest_sum > 0:
            result = 0
        elif cur_prod >= s_prod:
            if cur_prod == s_prod:
                same_number.add(value)
            result = 0
        else:
            result = factorial(n) // product(factorial(using_values[i]) for i in range(10) if using_values[i] > 0)
        
        memoized[cur_prod] += result
        return memoized[cur_prod]
    
    ret = 0
    for use_value in range(upper_val, -1, -1):
        if cur_prod * (use_value + 1) > s_prod or rest_sum - use_value < 0:
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
        
        combs = factorial(trial - 1) // product(factorial(rest_values[elem]) for elem in range(10) if rest_values[elem] > 0)
        
        ret += combs
        rest_values[i] += 1
    
    if rest_values[s_number] > 0:
        rest_values[s_number] -= 1
        return ret + lower_number(n, deep + 1, s_part, rest_values)
    else:
        return ret


def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num - 1)


def product(iterable):
    res = 1
    for x in iterable:
        res *= x
    return res


def main():
    s = input()
    s_part = [int(char) for char in s]
    n = len(s)
    sum_max = (n + 1) * 10
    s_sum = sum(s_part)
    s_prod = product(c + 1 for c in s_part)
    
    SUM_USE_ZERO_DP = [[0] * sum_max for _ in range(n + 1)]
    SUM_USE_ZERO_DP[0][0] = 1
    
    for len_value in range(n):
        for num in range(sum_max):
            for i in range(10):
                if num + i < sum_max:
                    SUM_USE_ZERO_DP[len_value + 1][num + i] += SUM_USE_ZERO_DP[len_value][num]
    
    P_SUM_USE_ZERO_DP = [x[:] for x in SUM_USE_ZERO_DP]
    
    for len_value in range(n + 1):
        for i in range(1, sum_max):
            P_SUM_USE_ZERO_DP[len_value][i] += P_SUM_USE_ZERO_DP[len_value][i - 1]
    
    lower = P_SUM_USE_ZERO_DP[n][s_sum - 1] if s_sum != 0 else 0
    upper = P_SUM_USE_ZERO_DP[n][s_sum]
    
    prod_memoized = defaultdict(int)
    same_number = set()
    lower_prod_value = lower_prod(n, 0, "", s_sum, 1, s_prod, 9, [0] * 10, prod_memoized, same_number)
    
    lower_number_value = 0
    for same in same_number:
        values = Counter(int(elem) for elem in same)
        lower_number_value += lower_number(n, 0, s_part, values)
    
    print(lower + sum(prod_memoized.values()) + lower_number_value)

main()