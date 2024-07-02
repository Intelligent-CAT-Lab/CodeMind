import re
def removezero_ip(ip):
 string = re.sub('\.[0]*', '.', ip)
 return string

removezero_ip("216.08.094.196")