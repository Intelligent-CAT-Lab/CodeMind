def f(numbers, prefix):
    return sorted(n[len(prefix):] if (len(n) > len(prefix) and n.startswith(prefix)) else n	## {"n" : '',"prefix" : ''}
                  for n in numbers)	## {"n" : '',"numbers" : ''}
