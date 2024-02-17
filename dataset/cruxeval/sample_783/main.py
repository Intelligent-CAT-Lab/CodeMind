def f(text, comparison):
    length = len(comparison)
    if length <= len(text):
        for i in range(length):
            if comparison[length - i - 1] != text[len(text) - i - 1]:
                return i
    return length