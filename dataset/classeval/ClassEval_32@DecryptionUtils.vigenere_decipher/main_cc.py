
class DecryptionUtils: 
    def __init__(self, key):
        """
        Initializes the decryption utility with a key.
        :param key: The key to use for decryption,str.
        """
        self.key = key

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