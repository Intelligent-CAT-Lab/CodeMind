def f(value):
    parts = value.partition(' ')[::2]	## {"parts" : '',"value" : ''}
    return ''.join(parts)	## {"parts" : ''}
