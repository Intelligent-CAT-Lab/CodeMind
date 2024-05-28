def round_and_sum(list1):
  lenght=len(list1)
  round_and_sum=sum(list(map(round,list1))* lenght)
  return round_and_sum