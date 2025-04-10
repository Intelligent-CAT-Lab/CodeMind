
class DecryptionUtils: 
    def __init__(self, key):
        """
        Initializes the decryption utility with a key.
        :param key: The key to use for decryption,str.
        """
        self.key = key

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