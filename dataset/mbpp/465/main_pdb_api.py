def drop_empty(dict1):
  dict1 = {key:value for (key, value) in dict1.items() if value is not None}
  return dict1
drop_empty({'c1': 'Red', 'c2': 'Green', 'c3':None})