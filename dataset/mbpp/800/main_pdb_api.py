import re
def remove_all_spaces(text):
 return (re.sub(r'\s+', '',text))
remove_all_spaces('python  program')