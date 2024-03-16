import sys

class scH(dict):
    def put(self, key, value):
        self[key] = value

class scH2(dict):
    def put(self, key, value):
        self[key] = value

def run():
    hash = scH()
    hash.put(' ', "101")
    hash.put('\'', "000000")
    hash.put(',', "000011")
    hash.put('-', "10010001")
    hash.put('.', "010001")
    hash.put('?', "000001")
    hash.put('A', "100101")
    hash.put('B', "10011010")
    hash.put('C', "0101")
    hash.put('D', "0001")
    hash.put('E', "110")
    hash.put('F', "01001")
    hash.put('G', "10011011")
    hash.put('H', "010000")
    hash.put('I', "0111")
    hash.put('J', "10011000")
    hash.put('K', "0110")
    hash.put('L', "00100")
    hash.put('M', "10011001")
    hash.put('N', "1