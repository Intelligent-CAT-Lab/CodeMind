def f(text, position, value):
   length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
   index = position % (length)	## <state>index = CLRJ | position = CLRJ | length = CLRJ</state>
   if position < 0:	## <state>position = CLRJ</state>
       index = length // 2
   new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
   new_text.insert(index, value)	## <state>new_text = CLRJ | index = CLRJ | value = CLRJ</state>
   new_text.pop(length-1)	## <state>new_text = CLRJ | length = CLRJ</state>
   return ''.join(new_text)	## <state>new_text = CLRJ</state>
