def triangle_area(a, b, c):
    if a + b <= c or a + c <= b or b + c <= a:	## a = CLRJ|b = CLRJ|c = CLRJ
        return -1 
    s = (a + b + c)/2    	## s = CLRJ|a = CLRJ|b = CLRJ|c = CLRJ
    area = (s * (s - a) * (s - b) * (s - c)) ** 0.5	## area = CLRJ|s = CLRJ|a = CLRJ|b = CLRJ|c = CLRJ
    area = round(area, 2)	## area = CLRJ
    return area	## area = CLRJ
