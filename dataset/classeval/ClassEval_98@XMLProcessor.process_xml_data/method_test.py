def test(self):

        with open('test.xml', 'w') as f:
            f.write('<root>\n    <item>apple</item>\n    <item>orange</item>\n</root>')
        self.xml_file = 'test.xml'
        self.processor = XMLProcessor(self.xml_file)
        tree = ET.parse(self.processor.file_name)
        self.processor.root = tree.getroot()

        file_name = 'processed.xml'
        result = self.processor.process_xml_data(file_name)

        processor1 = XMLProcessor(file_name)
        tree1 = ET.parse(processor1.file_name)
        processor1.root = tree1.getroot()

        lst = processor1.root.findall('item')

        os.remove('processed.xml')
        os.remove('test.xml')
        return result,processor1.root,lst[0].text,lst[1].text