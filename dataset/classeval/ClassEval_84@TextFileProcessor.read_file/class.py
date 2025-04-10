import json


class TextFileProcessor:
    def __init__(self, file_path):
        self.file_path = file_path

    def read_file_as_json(self):
        with open(self.file_path, 'r') as file:
            data = json.load(file)

        return data

    def read_file(self):
        with open(self.file_path, 'r') as file:
            return file.read()

    def write_file(self, content):
        with open(self.file_path, 'w') as file:
            file.write(content)

    def process_file(self):
        content = self.read_file()
        content = ''.join([char for char in content if char.isalpha()])
        self.write_file(content)
        return content