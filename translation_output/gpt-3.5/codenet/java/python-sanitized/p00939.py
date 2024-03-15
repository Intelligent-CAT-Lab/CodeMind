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
            for i in range(1, n+1):
                ret *= i
            for i in range(10):
                for j in range(1, using_values[i] + 1):
                    ret /= j
        
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
        
        combs = 1
        for j in range(1, trial):
            combs *= j
        for elem in range(10):
            if rest_values[elem] <= 0:
                continue
            for j in range(1, rest_values[elem] + 1):
                combs /= j
        
        ret += combs
        rest_values[i] += 1
    
    if rest_values[s_number] > 0:
        rest_values[s_number] -= 1
        return ret + lower_number(n, deep + 1, s_part, rest_values)
    else:
        return ret

if __name__ == '__main__':
    import sys
    memoized = {}
    same_number = set()
    
    # Input processing similar to Java Scanner
    s = input().strip()
    s_part = [int(d) for d in s]
    
    n = len(s)
    sum_max = (n + 1) * 10
    s_sum = sum([int(c) for c in s])
    s_prod = 1
    
    for c in s:
        s_prod *= int(c) + 1
    
    # Print output similar to Java System.out.println
    print(lower + sum_memoized + lower_number)