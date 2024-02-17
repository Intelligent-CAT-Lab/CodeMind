word = 'python_program'
import re
print(''.join(x.capitalize() or '_' for x in word.split('_')))