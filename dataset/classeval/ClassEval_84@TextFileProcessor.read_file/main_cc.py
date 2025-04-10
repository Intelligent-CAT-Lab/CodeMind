import json
class TextFileProcessor: 
    def __init__(self, file_path):
        """
        Initialize the file path.
        :param file_path: str
        """
        self.file_path = file_path

    def read_file(self):
        with open(self.file_path, 'r') as file:
            return file.read()