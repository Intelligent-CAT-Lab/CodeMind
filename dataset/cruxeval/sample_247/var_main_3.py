def f(s):
    if s.isalpha():	## <state>s = CLRJ</state>
        return "yes"
    if s == "":
        return "str is empty"
    return "no"