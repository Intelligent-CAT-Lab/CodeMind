sentence = '(A (b B))'
if sentence == '':
  print('')
else:
  sentence = sentence.replace('(', '')
  sentence = sentence.replace(')', '')
  print(sentence.capitalize().replace(' ', ''))