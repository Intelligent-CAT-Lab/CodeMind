def f(text, changes):
    result = ''
    count = 0
    changes = list(changes)
    for char in text:
        result += char if char in 'e' else changes[count % len(changes)]
        count += (1 if char not in 'e' else 0)
    return result