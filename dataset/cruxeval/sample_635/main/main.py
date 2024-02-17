def f(text):
    valid_chars = ['-', '_', '+', '.', '/', ' ']
    text = text.upper()
    for char in text:
        if char.isalnum() == False and char not in valid_chars:
            return False
    return True