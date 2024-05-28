import re
def extract_values(text):
 return (re.findall(r'"(.*?)"', text))