def f(char):
    if char not in 'aeiouAEIOU':	## char = CLRJ
        return None
    if char in 'AEIOU':	## char = CLRJ
        return char.lower()
    return char.upper()	## char = CLRJ
