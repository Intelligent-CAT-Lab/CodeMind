test_str = "(7, 8, 9)"
res = tuple(int(num) for num in test_str.replace('(', '').replace(')', '').replace('...', '').split(', '))
print(res)