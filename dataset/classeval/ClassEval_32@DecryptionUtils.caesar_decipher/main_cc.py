
class DecryptionUtils: 
    def __init__(self, key):
        """
        Initializes the decryption utility with a key.
        :param key: The key to use for decryption,str.
        """
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