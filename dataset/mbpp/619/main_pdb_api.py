def move_num(test_str):
  res = ''
  dig = ''
  for ele in test_str:
    if ele.isdigit():
      dig += ele
    else:
      res += ele
  res += dig
  return (res) 
move_num('I1love143you55three3000thousand')