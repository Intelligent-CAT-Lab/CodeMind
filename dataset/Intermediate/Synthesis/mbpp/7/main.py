import re
def find_char_long(text):
  return (re.findall(r"\b\w{4,}\b", text))