def f(char):
    if char not in 'aeiouAEIOU':
        return None
    if char in 'AEIOU':
        return char.lower()
    return char.upper()