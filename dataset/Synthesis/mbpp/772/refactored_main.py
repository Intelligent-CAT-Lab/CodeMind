test_str = 'The person is most value tet'
K = 3
temp = test_str.split()
res = [ele for ele in temp if len(ele) != K]
res = ' '.join(res)
print(res)