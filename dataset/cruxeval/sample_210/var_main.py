def f(n, m, num):
    x_list = list(range(n, m+1))	## {"x_list" : '',"n" : '',"m" : ''}
    j = 0	## {"j" : ''}
    while True:
        j = (j + num) % len(x_list)	## {"j" : '',"num" : '',"x_list" : ''}
        if x_list[j] % 2 == 0:	## {"x_list" : '',"j" : ''}
            return x_list[j]	## {"x_list" : '',"j" : ''}
