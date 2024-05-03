def f(ints):
    counts = [0] * 301	## {"counts" : ''}

    for i in ints:	## {"i" : '',"ints" : ''}
        counts[i] += 1	## {"counts" : '',"i" : ''}

    r = []	## {"r" : ''}
    for i in range(len(counts)):	## {"i" : '',"counts" : ''}
        if counts[i] >= 3:	## {"counts" : '',"i" : ''}
            r.append(str(i))	## {"r" : '',"i" : ''}
    counts.clear()	## {"counts" : ''}
    return ' '.join(r)	## {"r" : ''}
