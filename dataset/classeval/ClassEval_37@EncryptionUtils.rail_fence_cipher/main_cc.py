
class EncryptionUtils: 
    def __init__(self, key):
        """
        Initializes the class with a key.
        :param key: The key to use for encryption, str.
        """
        self.key = key

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