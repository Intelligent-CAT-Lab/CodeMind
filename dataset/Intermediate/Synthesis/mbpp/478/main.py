import re
def remove_lowercase(str1):
 return re.sub('[a-z]', '', str1)