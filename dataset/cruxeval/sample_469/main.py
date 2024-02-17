def f(text, position, value):
   length = len(text)
   index = position % (length)
   if position < 0:
       index = length // 2
   new_text = list(text)
   new_text.insert(index, value)
   new_text.pop(length-1)
   return ''.join(new_text)