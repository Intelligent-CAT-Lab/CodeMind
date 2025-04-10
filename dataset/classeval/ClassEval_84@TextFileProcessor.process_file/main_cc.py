import json
class TextFileProcessor: 
    def __init__(self, file_path):
        """
        Initialize the file path.
        :param file_path: str
        """
        self.file_path = file_path

    def process_file(self):
        content = self.read_file()
        content = ''.join([char for char in content if char.isalpha()])
        self.write_file(content)
        return content
    def read_file(self):
        with open(self.file_path, 'r') as file:
            return file.read()
    def write_file(self, content):
        with open(self.file_path, 'w') as file:
            file.write(content)