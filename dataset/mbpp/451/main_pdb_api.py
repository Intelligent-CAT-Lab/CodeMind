import re
def remove_whitespaces(text1):
  return (re.sub(r'\s+', '',text1))
remove_whitespaces(' Google    Flutter ')