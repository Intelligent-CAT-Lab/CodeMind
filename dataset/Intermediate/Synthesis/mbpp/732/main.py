import re
def replace_specialchar(text):
 return (re.sub("[ ,.]", ":", text))
