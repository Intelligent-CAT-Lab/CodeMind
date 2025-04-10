
class EncryptionUtils: 
    def __init__(self, key):
        """
        Initializes the class with a key.
        :param key: The key to use for encryption, str.
        """
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