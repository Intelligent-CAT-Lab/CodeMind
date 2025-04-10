import unittest
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
class Test(unittest.TestCase):
    def test(self):
            self.file = 'test.txt'
            self.content = 'Hello, 123 World!'
            self.expected_result = 'HelloWorld'
            textFileProcessor = TextFileProcessor(self.file)
            textFileProcessor.read_file = MagicMock(return_value=self.content)
            textFileProcessor.write_file = MagicMock()
            result = textFileProcessor.process_file()
            textFileProcessor.read_file.assert_called_once()
            textFileProcessor.write_file.assert_called_once_with(self.expected_result)
            return result,self.expected_result