def f(text):
    if text.isdecimal():	## <state>text = CLRJ</state>
        return 'yes'
    else:
        return 'no'