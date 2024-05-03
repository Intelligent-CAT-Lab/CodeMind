def f(numbers, prefix):
    return sorted(n[len(prefix):] if (len(n) > len(prefix) and n.startswith(prefix)) else n	## n = CLRJ | prefix = CLRJ
                  for n in numbers)	## n = CLRJ | numbers = CLRJ
