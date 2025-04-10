import unittest
class EncryptionUtils:
    def __init__(self, key):
        self.key = key

    def caesar_cipher(self, plaintext, shift):
        ciphertext = ""
        for char in plaintext:
            if char.isalpha():
                if char.isupper():
                    ascii_offset = 65
                else:
                    ascii_offset = 97
                shifted_char = chr((ord(char) - ascii_offset + shift) % 26 + ascii_offset)
                ciphertext += shifted_char
            else:
                ciphertext += char
        return ciphertext
    
    def vigenere_cipher(self, plain_text):
        encrypted_text = ""
        key_index = 0
        for char in plain_text:
            if char.isalpha():
                shift = ord(self.key[key_index % len(self.key)].lower()) - ord('a')
                encrypted_char = chr((ord(char.lower()) - ord('a') + shift) % 26 + ord('a'))
                encrypted_text += encrypted_char.upper() if char.isupper() else encrypted_char
                key_index += 1
            else:
                encrypted_text += char
        return encrypted_text

    def rail_fence_cipher(self, plain_text, rails):
        fence = [['\n' for _ in range(len(plain_text))] for _ in range(rails)]
        direction = -1
        row, col = 0, 0

        for char in plain_text:
            if row == 0 or row == rails-1:
                direction = -direction

            fence[row][col] = char
            col += 1
            row += direction

        encrypted_text = ''
        for i in range(rails):
            for j in range(len(plain_text)):
                if fence[i][j] != '\n':
                    encrypted_text += fence[i][j]

        return encrypted_text
class Test(unittest.TestCase):
    def test(self):
            encryption_utils = EncryptionUtils("key")
            return encryption_utils.vigenere_cipher('abc')