def f(names):
    parts = names.split(',')	## {"parts" : '',"names" : ''}
    for i, part in enumerate(parts):	## {"i" : '',"part" : '',"parts" : ''}
        parts[i] = part.replace(' and', '+').title().replace('+', ' and')	## {"parts" : '',"i" : '',"part" : ''}
    return ', '.join(parts)	## {"parts" : ''}
