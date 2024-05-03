def f(test_str):
    s = test_str.replace('a', 'A')	## <state>s = CLRJ | test_str = CLRJ</state>
    return s.replace('e', 'A')	## <state>s = CLRJ</state>
