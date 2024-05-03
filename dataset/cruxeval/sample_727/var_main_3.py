def f(numbers, prefix):
    return sorted(n[len(prefix):] if (len(n) > len(prefix) and n.startswith(prefix)) else n	## <state>n = CLRJ | prefix = CLRJ</state>
                  for n in numbers)	## <state>n = CLRJ | numbers = CLRJ</state>
