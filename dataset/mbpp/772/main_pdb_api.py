def remove_length(test_str, K):
  temp = test_str.split()
  res = [ele for ele in temp if len(ele) != K]
  res = ' '.join(res)
  return (res) 
remove_length('The person is most value tet', 3)