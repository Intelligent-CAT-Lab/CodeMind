filename = 'docs.doc'
suffix = filename.split('.')[-1]
f2 = filename + suffix[::-1]
print(f2.endswith(suffix))