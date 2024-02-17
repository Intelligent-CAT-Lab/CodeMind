def f(numbers, prefix):
    return sorted(n[len(prefix):] if (len(n) > len(prefix) and n.startswith(prefix)) else n
                  for n in numbers)