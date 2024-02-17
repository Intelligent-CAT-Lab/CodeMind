strings = ['condor', 'eyes', 'gay', 'isa']
substr = 'd'
list = [s for s in strings if s.startswith(substr)]
list = sorted(list, key=len)
print(list)