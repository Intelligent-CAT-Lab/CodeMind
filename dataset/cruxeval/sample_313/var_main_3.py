def f(s, l):
    return s.ljust(l, '=').rpartition('=')[0]	## <state>s = CLRJ | l = CLRJ</state>
