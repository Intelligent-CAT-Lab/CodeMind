import os
class MultiLineOutput:
    def __init__(self, content):
        self.content = content
        self.types = [self.identify_type(line) for line in content.split('\n')]

    def identify_type(self, value):
        try:
            int(value)
            return int
        except ValueError:
            try:
                float(value)
                return float
            except ValueError:
                return str

    def __repr__(self):
        return f'MultiLineOutput({self.content})'
    # get values as a list
    def get_values(self):
        return [cast_to_value(value) for value in self.content.split('\n')]
    


def cast_to_value(value):
    try:
        return int(value)
    except ValueError:
        try:
            return float(value)
        except ValueError:
            return value


def cast_to_type(content):

    # Check for MultiLineOutput
    if '\n' in content:
        return MultiLineOutput(content)
    elif ' ' in content:
        # It's a list
        return [cast_to_value(item) for item in content.split()]
    else:
        # Single value
        return cast_to_value(content)

# Example Usage:
# cast_to_type('your_file_path.txt')


# Pass root directory to get all "input.txt" and "output.txt" files

def get_input_output_files(root_dir):
    input_files = []
    output_files = []
    for root, dirs, files in os.walk(root_dir):
        for file in files:
            if file == 'input.txt':
                input_files.append(os.path.join(root, file))
            if file == 'output.txt':
                output_files.append(os.path.join(root, file))
    return input_files, output_files


# input_files, output_files = get_input_output_files('/home/changshu/CodeMind/dataset/Avatar/Avatar-python')
# print(input_files)
# print(output_files)

# for file in input_files:
#     data = open(file).read().strip()
#     try:
#         print(cast_to_type(data))
#     except Exception as e:
#         print(f'Error in {file}: {e}\ndata: {data}')

# for file in output_files:
#     data = open(file).read().strip()
#     try:
#         print(cast_to_type(data))
#     except Exception as e:
#         print(f'Error in {file}: {e}\ndata: {data}')
    