def f(text):
    return max(text.find(ch) for ch in 'aeiou')