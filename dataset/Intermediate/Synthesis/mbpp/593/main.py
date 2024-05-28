import re
def removezero_ip(ip):
 string = re.sub('\.[0]*', '.', ip)
 return string
