def f(text, suffix, num):
    str_num = str(num)	## <state>str_num = CLRJ | num = CLRJ</state>
    return text.endswith(suffix + str_num)	## <state>text = CLRJ | suffix = CLRJ | str_num = CLRJ</state>
