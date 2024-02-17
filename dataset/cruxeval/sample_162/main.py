def f(text):
    result = ''
    for char in text:
        if char.isalnum():
            result += char.upper()
    return result