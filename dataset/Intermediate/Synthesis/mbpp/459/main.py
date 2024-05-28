import re
def remove_uppercase(str1):
  return re.sub('[A-Z]', '', str1)