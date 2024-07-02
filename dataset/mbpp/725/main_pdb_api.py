import re
def extract_quotation(text1):
  return (re.findall(r'"(.*?)"', text1))
extract_quotation('Cortex "A53" Based "multi" tasking "Processor"')