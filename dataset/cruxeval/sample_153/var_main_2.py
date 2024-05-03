def f(text, suffix, num):
    str_num = str(num)	## str_num = [] | num = []
    return text.endswith(suffix + str_num)	## text = [] | suffix = [] | str_num = []
