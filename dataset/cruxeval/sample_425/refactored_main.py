a = '/CL44     '
a = a.replace('/', ':')
z = a.rpartition(':')
print([z[0], z[1], z[2]])