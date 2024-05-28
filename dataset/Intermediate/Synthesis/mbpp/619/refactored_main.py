test_str = 'I1love143you55three3000thousand'
res = ''
dig = ''
for ele in test_str:
  if ele.isdigit():
    dig += ele
  else:
    res += ele
res += dig
print(res)