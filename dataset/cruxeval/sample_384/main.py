def f(text, chars):
    chars = list(chars)
    text = list(text)
    new_text = text
    while len(new_text) > 0 and text:
        if new_text[0] in chars:
            new_text = new_text[1:]
        else:
            break 
    return ''.join(new_text)