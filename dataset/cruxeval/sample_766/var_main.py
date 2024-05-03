def f(values, value):
    length = len(values)	## {"length" : '',"values" : ''}
    new_dict = dict.fromkeys(values, value)	## {"new_dict" : '',"values" : '',"value" : ''}
    new_dict[''.join(sorted(values))] = value * 3	## {"new_dict" : '',"values" : '',"value" : ''}
    return new_dict	## {"new_dict" : ''}
