def change_base(x: int, base: int):
    ret = ""	## ret = CLRJ
    while x > 0:	## x = CLRJ
        ret = str(x % base) + ret	## ret = CLRJ|x = CLRJ|base = CLRJ
        x //= base	## x = CLRJ|base = CLRJ
    return ret	## ret = CLRJ
