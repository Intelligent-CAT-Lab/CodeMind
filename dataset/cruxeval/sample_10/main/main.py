def f(text):
    new_text = ''
    for ch in text.lower().strip():
        if ch.isnumeric() or ch in 'ÄäÏïÖöÜü':
            new_text += ch
    return new_text