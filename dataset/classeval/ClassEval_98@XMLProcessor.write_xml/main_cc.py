import xml.etree.ElementTree as ET
class XMLProcessor: 
    def __init__(self, file_name):
        """
        Initialize the XMLProcessor object with the given file name.
        :param file_name:string, the name of the XML file to be processed.
        """
        self.file_name = file_name
        self.root = None

    def write_xml(self, file_name):
        try:
            tree = ET.ElementTree(self.root)
            tree.write(file_name)
            return True
        except:
            return False