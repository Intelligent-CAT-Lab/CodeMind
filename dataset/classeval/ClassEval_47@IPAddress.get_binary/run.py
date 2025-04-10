import os
import unittest
class IPAddress:
    def __init__(self, ip_address):
        self.ip_address = ip_address

    def is_valid(self):
        octets = self.ip_address.split('.')
        if len(octets) != 4:
            return False
        for octet in octets:
            if not octet.isdigit() or int(octet) < 0 or int(octet) > 255:
                return False
        return True

    def get_octets(self):
        if self.is_valid():
            return self.ip_address.split('.')
        else:
            return []

    def get_binary(self):
        if self.is_valid():
            binary_octets = []
            for octet in self.get_octets():
                binary_octets.append(format(int(octet), '08b'))
            return '.'.join(binary_octets)
        else:
            return ''
class Test(unittest.TestCase):
    def test(self):
            ipaddress = IPAddress(".10.10.10")
            return ipaddress.get_binary()
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_47@IPAddress.get_binary/output.txt', 'w') as wr:
    wr.write(str(a))
        