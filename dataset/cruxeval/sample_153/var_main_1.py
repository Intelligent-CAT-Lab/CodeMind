def f(text, suffix, num):
    str_num = str(num)	## str_num = CLRJ | num = CLRJ
    return text.endswith(suffix + str_num)	## text = CLRJ | suffix = CLRJ | str_num = CLRJ
