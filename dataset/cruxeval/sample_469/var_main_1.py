def f(text, position, value):
   length = len(text)	## length = CLRJ | text = CLRJ
   index = position % (length)	## index = CLRJ | position = CLRJ | length = CLRJ
   if position < 0:	## position = CLRJ
       index = length // 2
   new_text = list(text)	## new_text = CLRJ | text = CLRJ
   new_text.insert(index, value)	## new_text = CLRJ | index = CLRJ | value = CLRJ
   new_text.pop(length-1)	## new_text = CLRJ | length = CLRJ
   return ''.join(new_text)	## new_text = CLRJ
