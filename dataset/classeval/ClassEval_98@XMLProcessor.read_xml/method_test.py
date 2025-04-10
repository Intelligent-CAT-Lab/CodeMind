def test(self):

        with open('test.xml', 'w') as f:
            f.write('<root>\n    <item>apple</item>\n</root>')
        self.xml_file = 'test.xml'
        self.processor = XMLProcessor(self.xml_file)
        tree = ET.parse(self.processor.file_name)
        self.processor.root = tree.getroot()

        root = self.processor.read_xml()
        lst = root.findall('item')

        os.remove('test.xml')
        return root,lst[0].text