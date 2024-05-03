def f(char):
    if char not in 'aeiouAEIOU':	## <state>char = CLRJ</state>
        return None
    if char in 'AEIOU':	## <state>char = CLRJ</state>
        return char.lower()
    return char.upper()	## <state>char = CLRJ</state>
