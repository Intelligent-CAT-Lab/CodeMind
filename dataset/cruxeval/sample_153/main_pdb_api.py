def f(text, suffix, num):
    str_num = str(num)
    return text.endswith(suffix + str_num)
f('friends and love', 'and', 3)