def f(char):
    if char not in 'aeiouAEIOU':	## char = []
        return None
    if char in 'AEIOU':	## char = []
        return char.lower()
    return char.upper()	## char = []
