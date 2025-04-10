import zipfile
class ZipFileProcessor: 
    def __init__(self, file_name):
        """
        Initialize file name
        :param file_name:string
        """
        self.file_name = file_name

    def create_zip_file(self, files, output_file_name):
        try:
            with zipfile.ZipFile(output_file_name, 'w') as zip_file:
                for file in files:
                    zip_file.write(file)
            return True
        except:
            return False