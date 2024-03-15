import java.util.HashMap

class scH(HashMap):
    def put(self, value, key):
        return super().put(key, value)

class scH2(HashMap):
    def put(self, value, key):
        return super().put(key, value)

def run():
    hash = scH()
    hash[' '] = "101"
    hash['\''] = "000000"
    hash[','] = "000011"
    hash['-'] = "10010001"
    hash['.'] = "010001"
    hash['?'] = "000001"
    hash['A'] = "100101"
    hash['B'] = "10011010"
    hash['C'] = "0101"
    hash['D'] = "0001"
    hash['E'] = "110"
    hash['F'] = "01001"
    hash['G'] = "10011011"
    hash['H'] = "010000"
    hash['I'] = "0111"
    hash['J'] = "10011000"
    hash['K'] = "0110"
    hash['L'] = "00100"
    hash['