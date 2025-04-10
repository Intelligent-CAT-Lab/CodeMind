import zipfile
class ZipFileProcessor: 
    def __init__(self, file_name):
        """
        Initialize file name
        :param file_name:string
        """
        self.file_name = file_name

    def extract_all(self, output_path):
        try:
            with zipfile.ZipFile(self.file_name, 'r') as zip_file:
                zip_file.extractall(output_path)
            return True
        except:
            return False