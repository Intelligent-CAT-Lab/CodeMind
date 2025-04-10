import unittest
import zipfile


class ZipFileProcessor:
    def __init__(self, file_name):
        self.file_name = file_name

    def read_zip_file(self):
        try:
            zip_file = zipfile.ZipFile(self.file_name, 'r')
            return zip_file
        except:
            return None

    def extract_all(self, output_path):
        try:
            with zipfile.ZipFile(self.file_name, 'r') as zip_file:
                zip_file.extractall(output_path)
            return True
        except:
            return False

    def extract_file(self, file_name, output_path):
        try:
            with zipfile.ZipFile(self.file_name, 'r') as zip_file:
                zip_file.extract(file_name, output_path)
            return True
        except:
            return False

    def create_zip_file(self, files, output_file_name):
        try:
            with zipfile.ZipFile(output_file_name, 'w') as zip_file:
                for file in files:
                    zip_file.write(file)
            return True
        except:
            return False
class Test(unittest.TestCase):
    def test(self):
            test_folder = 'test_folder'
            os.makedirs(test_folder, exist_ok=True)
            example_file_path = os.path.join(test_folder, 'example.txt')
            with open(example_file_path, 'w') as file:
                file.write('This is an example file.')
            zip_file_name = 'example3.zip'
            with zipfile.ZipFile(zip_file_name, 'w') as zip_file:
                zip_file.write(example_file_path, os.path.basename(example_file_path))
            processor = ZipFileProcessor(zip_file_name)
            zip_file = processor.read_zip_file()
            zip_file.close()
            os.remove(zip_file_name)
            os.remove(example_file_path)
            os.rmdir(test_folder)
            return zip_file.filename,zip_file.mode