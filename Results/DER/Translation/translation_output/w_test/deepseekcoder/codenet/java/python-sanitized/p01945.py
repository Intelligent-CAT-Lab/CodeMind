def count_pairs(s):
    while '()' in s:
        s = s.replace('()', '')
    star_index = s.index('*')
    left = star_index - 1
    right = star_index + 1
    result = 0
    while left >= 0:
        if s[left] == '(':
            while right <= len(s) - 1:
                if s[right] == ')':
                    result += 1
                    break
                right += 1
        left -= 1
    return result

# Test input
print(count_pairs('((*)())'))  # Expected output: 2