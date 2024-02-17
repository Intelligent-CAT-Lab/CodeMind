description = '{0}, {0}!!!'
values = ['R', None]
if values[1] is None:
    values = values[0:1]
else:
    values = values[1:]
print(description.format(*values))