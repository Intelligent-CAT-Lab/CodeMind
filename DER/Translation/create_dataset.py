import os
import argparse


def main(args):

    translation_dataset = 'translation_dataset'

    if args.dataset == 'avatar':
        main_dir = 'dataset/Avatar'
        source_langs = os.listdir(main_dir)
        programming_lang = ''

        for source_lang in source_langs:

            if 'java' in source_lang:
                programming_lang = 'java'
                os.makedirs(f'{translation_dataset}/avatar/java/code', exist_ok=True)
                os.makedirs(f'{translation_dataset}/avatar/java/tests', exist_ok=True)
            elif 'python' in source_lang:
                programming_lang = 'python'
                os.makedirs(f'{translation_dataset}/avatar/python/code', exist_ok=True)
                os.makedirs(f'{translation_dataset}/avatar/python/tests', exist_ok=True)

            problem_ids = os.listdir(f'{main_dir}/{source_lang}')

            for problem_id in problem_ids:

                if programming_lang == 'java':
                    java_file = ''

                    for file in os.listdir(f'{main_dir}/{source_lang}/{problem_id}'):
                        if file.endswith('.java'):
                            java_file = file
                            break

                    with open(f'{main_dir}/{source_lang}/{problem_id}/{java_file}', 'r') as f:
                        file_content = f.read()
                        file_content = file_content.replace(java_file.split('.')[0], problem_id)

                    with open(f'{translation_dataset}/avatar/{programming_lang}/code/{problem_id}.java', 'w') as fw:
                        fw.write(file_content)

                    with open(f'{main_dir}/{source_lang}/{problem_id}/input.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_in.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_out.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/misleading_output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_misleading_out.txt', 'w') as fw:
                        fw.write(file_content)

                if programming_lang == 'python':
                    with open(f'{main_dir}/{source_lang}/{problem_id}/main.py', 'r') as f:
                        file_content = f.read()

                    with open(f'{translation_dataset}/avatar/{programming_lang}/code/{problem_id}.py', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/input.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_in.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_out.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/misleading_output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/avatar/{programming_lang}/tests/{problem_id}_misleading_out.txt', 'w') as fw:
                        fw.write(file_content)

    elif args.dataset == 'codenet':
        main_dir = 'dataset/CodeNet'
        source_langs = os.listdir(main_dir)
        programming_lang = ''

        for source_lang in source_langs:

            if 'Java' in source_lang:
                programming_lang = 'java'
                os.makedirs(f'{translation_dataset}/codenet/java/code', exist_ok=True)
                os.makedirs(f'{translation_dataset}/codenet/java/tests', exist_ok=True)
            elif 'Python' in source_lang:
                programming_lang = 'python'
                os.makedirs(f'{translation_dataset}/codenet/python/code', exist_ok=True)
                os.makedirs(f'{translation_dataset}/codenet/python/tests', exist_ok=True)

            problem_ids = os.listdir(f'{main_dir}/{source_lang}')
            problem_ids = [x for x in problem_ids if '_' not in x]

            for problem_id in problem_ids:

                if programming_lang == 'java':
                    java_file = 'Main.java'

                    with open(f'{main_dir}/{source_lang}/{problem_id}/{java_file}', 'r') as f:
                        file_content = f.read()
                        file_content = file_content.replace(java_file.split('.')[0], problem_id)

                    with open(f'{translation_dataset}/codenet/{programming_lang}/code/{problem_id}.java', 'w') as fw:
                        fw.write(file_content)

                    with open(f'{main_dir}/{source_lang}/{problem_id}/input.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_in.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_out.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/misleading_output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_misleading_out.txt', 'w') as fw:
                        fw.write(file_content)

                if programming_lang == 'python':
                    with open(f'{main_dir}/{source_lang}/{problem_id}/main.py', 'r') as f:
                        file_content = f.read()

                    with open(f'{translation_dataset}/codenet/{programming_lang}/code/{problem_id}.py', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/input.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_in.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_out.txt', 'w') as fw:
                        fw.write(file_content)
                    
                    with open(f'{main_dir}/{source_lang}/{problem_id}/misleading_output.txt', 'r') as f:
                        file_content = f.read()
                    
                    with open(f'{translation_dataset}/codenet/{programming_lang}/tests/{problem_id}_misleading_out.txt', 'w') as fw:
                        fw.write(file_content)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='transform dataset into a format that can be used for code translation')
    parser.add_argument('--dataset', help='dataset to use for code translation', required=True, type=str)
    args = parser.parse_args()

    main(args)
