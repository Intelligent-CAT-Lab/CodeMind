s = '<' * 10
def f(num):
    if num % 2 == 0:	## <state>num = CLRJ</state>
        return s
    else:
        return num - 1	## <state>num = CLRJ</state>
