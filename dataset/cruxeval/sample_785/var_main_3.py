def f(n):
    streak = ''	## <state>streak = CLRJ</state>
    for c in str(n):	## <state>c = CLRJ | n = CLRJ</state>
        streak += c.ljust(int(c) * 2)	## <state>streak = CLRJ | c = CLRJ</state>
    return streak	## <state>streak = CLRJ</state>
