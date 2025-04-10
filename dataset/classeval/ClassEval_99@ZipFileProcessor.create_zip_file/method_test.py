def test(self):

        test_folder = 'test_folder'
        os.makedirs(test_folder, exist_ok=True)
        example_file_path = os.path.join(test_folder, 'example4.txt')
        with open(example_file_path, 'w') as file:
            file.write('This is an example file.')

        zip_file_name = 'example.zip'
        with zipfile.ZipFile(zip_file_name, 'w') as zip_file:
            zip_file.write(example_file_path, os.path.basename(example_file_path))

        processor = ZipFileProcessor(zip_file_name)
        output_directory = 'output_directory'
        new_zip_file = 'new_zip_file.zip'

        files_to_zip = [example_file_path]
        success = processor.create_zip_file(files_to_zip, new_zip_file)

        os.remove(example_file_path)
        os.rmdir(test_folder)
        return success,os.path.exists(new_zip_file)