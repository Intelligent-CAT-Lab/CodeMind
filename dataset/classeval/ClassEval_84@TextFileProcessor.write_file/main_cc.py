import json
class TextFileProcessor: 
    def __init__(self, file_path):
        """
        Initialize the file path.
        :param file_path: str
        """
        self.file_path = file_path

    def write_file(self, content):
        with open(self.file_path, 'w') as file:
            file.write(content)