def f(names):
    parts = names.split(',')
    for i, part in enumerate(parts):
        parts[i] = part.replace(' and', '+').title().replace('+', ' and')
    return ', '.join(parts)