def add_string(list_, string):
 add_string=[string.format(i) for i in  list_]
 return add_string
add_string([1,2,3,4],'temp{0}')