import re
def replace_specialchar(text):
 return (re.sub("[ ,.]", ":", text))

replace_specialchar('Python language, Programming language.')