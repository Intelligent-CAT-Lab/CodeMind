import re
def extract_quotation(text1):
  return (re.findall(r'"(.*?)"', text1))