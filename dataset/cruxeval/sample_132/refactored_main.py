a_str = 'abc'
prefix = 'abcd'
if a_str.removeprefix(prefix):
    print(a_str)
else:
    print(prefix + a_str)