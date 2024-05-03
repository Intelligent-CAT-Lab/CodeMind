def f(txt):
    coincidences = {}	## {"coincidences" : ''}
    for c in txt:	## {"c" : '',"txt" : ''}
        if c in coincidences:	## {"c" : '',"coincidences" : ''}
            coincidences[c] += 1	## {"coincidences" : '',"c" : ''}
        else:
            coincidences[c] = 1	## {"coincidences" : '',"c" : ''}
    return sum(coincidences.values())	## {"coincidences" : ''}
