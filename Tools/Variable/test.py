from tree_sitter import Language, Parser

Language.build_library(
    'build/my-languages.so',
    ['/home/changshu/tree-sitter-java']  # Path to the Java grammar repository
)

JAVA_LANGUAGE = Language('build/my-languages.so', 'java')
parser = Parser()
parser.set_language(JAVA_LANGUAGE)


def extract_methods(java_code):
    tree = parser.parse(bytes(java_code, 'utf8'))
    
    query = JAVA_LANGUAGE.query("""
    (method_declaration
      name: (identifier) @method)
    """)

    captures = query.captures(tree.root_node)
    print(captures)
    # method_names = [java_code[cap.node.start_byte:cap.node.end_byte].decode('utf8') for cap in captures]
    # return method_names

# Example usage
java_code = """
public class Example {
    public void methodOne() {
        // method body
    }
    private int methodTwo(int a, int b) {
        // method body
        return a + b;
    }
}
"""
print(extract_methods(java_code))
