def f(text):
    uppercase_index = text.find('A')
    if uppercase_index >= 0:
        return text[:uppercase_index] + text[text.find('a') + 1 :]
    else:
        return ''.join(sorted(text))