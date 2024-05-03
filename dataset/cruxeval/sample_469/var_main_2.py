def f(text, position, value):
   length = len(text)	## length = [] | text = []
   index = position % (length)	## index = [] | position = [] | length = []
   if position < 0:	## position = []
       index = length // 2
   new_text = list(text)	## new_text = [] | text = []
   new_text.insert(index, value)	## new_text = [] | index = [] | value = []
   new_text.pop(length-1)	## new_text = [] | length = []
   return ''.join(new_text)	## new_text = []
