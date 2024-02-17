s = 'galgu'
left, sep, right = s.rpartition('.')
new = sep.join([right, left])
_, sep, _ = new.rpartition('.')
print(new.replace(sep, ', '))