text = 'dga nqdk\rull qcha kl'
separator = 1
splitted = text.splitlines()
if separator:
    result = [' '.join(s) for s in splitted]
else:
    result = splitted
print(result)