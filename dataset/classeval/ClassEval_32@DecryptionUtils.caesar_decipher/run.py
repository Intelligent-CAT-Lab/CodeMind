import os
import unittest
class DecryptionUtils:
    def __init__(self, key):
        self.key = key
    
    def caesar_decipher(self, ciphertext, shift):
        plaintext = ""
        for char in ciphertext:
            if char.isalpha():
                if char.isupper():
                    ascii_offset = 65
                else:
                    ascii_offset = 97
                shifted_char = chr((ord(char) - ascii_offset - shift) % 26 + ascii_offset)
                plaintext += shifted_char
            else:
                plaintext += char
        return plaintext
    
    def vigenere_decipher(self, ciphertext):
        decrypted_text = ""
        key_index = 0
        for char in ciphertext:
            if char.isalpha():
                shift = ord(self.key[key_index % len(self.key)].lower()) - ord('a')
                decrypted_char = chr((ord(char.lower()) - ord('a') - shift) % 26 + ord('a'))
                decrypted_text += decrypted_char.upper() if char.isupper() else decrypted_char
                key_index += 1
            else:
                decrypted_text += char
        return decrypted_text
    
    def rail_fence_decipher(self, encrypted_text, rails):
        fence = [['\n' for _ in range(len(encrypted_text))] for _ in range(rails)]
        direction = -1
        row, col = 0, 0

        for _ in range(len(encrypted_text)):
            if row == 0 or row == rails - 1:
                direction = -direction

            fence[row][col] = ''
            col += 1
            row += direction

        index = 0
        for i in range(rails):
            for j in range(len(encrypted_text)):
                if fence[i][j] == '':
                    fence[i][j] = encrypted_text[index]
                    index += 1

        plain_text = ''
        direction = -1
        row, col = 0, 0
        for _ in range(len(encrypted_text)):
            if row == 0 or row == rails - 1:
                direction = -direction

            plain_text += fence[row][col]
            col += 1
            row += direction

        return plain_text
class Test(unittest.TestCase):
    def test(self):
            d = DecryptionUtils('key')
            return d.caesar_decipher('bcdyza', 27)
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_32@DecryptionUtils.caesar_decipher/output.txt', 'w') as wr:
    wr.write(str(a))
        