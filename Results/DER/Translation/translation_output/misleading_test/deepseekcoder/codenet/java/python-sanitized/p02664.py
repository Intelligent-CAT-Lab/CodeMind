def replace_and_count(s):
    count = s.count('D') + s.count('?')
    s = s.replace('?', 'D')
    print(s + str(count))

# Test input
replace_and_count('PD?D??P')