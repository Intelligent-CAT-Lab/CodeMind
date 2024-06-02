import os
import logging
from dotenv import load_dotenv
import argparse
from tqdm import tqdm
from transformers import AutoTokenizer, AutoModelForCausalLM
from vllm import LLM, SamplingParams
import openai


os.makedirs(f'logs', exist_ok=True)
logging.basicConfig(filename=f"logs/translation.log", level=logging.INFO, format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s', datefmt='%Y-%m-%d %H:%M:%S')


def main(args):

    extensions = {'Python': 'py', 'Java': 'java'}

    experiment_type = 'no_test'
    if args.use_misleading_test:
        experiment_type = 'misleading_test'
    elif args.use_test:
        experiment_type = 'use_test'
    
    test_type = 'tests'
    if args.use_misleading_test:
        test_type = 'misleading_tests'

    in_folder = f'../dataset/Intermediate/Translation/{args.dataset}/{args.source_lang}/code'
    test_folder = f'../dataset/Intermediate/Translation/{args.dataset}/{args.source_lang}/tests'
    if args.der:
        out_folder = f'../Experiment_Results/intermediate/DER/Translation/{experiment_type}/{args.model.split("/")[-1]}/{args.dataset}/{args.source_lang}/{args.target_lang}'
    else:
        out_folder = f'../Experiment_Results/intermediate/SR/Translation/{experiment_type}/{args.model.split("/")[-1]}/{args.dataset}/{args.source_lang}/{args.target_lang}'

    in_files = os.listdir(in_folder)
    print(f'found {len(in_files)} inputs')

    # check for files alraedy extracted
    already_extracted_files = []
    if os.path.exists(out_folder):
        already_extracted_files = os.listdir(out_folder)
        if len(already_extracted_files) > 0:
            already_extracted_files = [x.split('.')[0] for x in already_extracted_files if os.stat(f'{out_folder}/{x}').st_size != 0]

    if len(already_extracted_files) > 0:
        in_files = [x for x in in_files if x.split('.')[0] not in already_extracted_files]

    ext = extensions[args.target_lang]
    device = f'cuda:{args.gpu_id}'

    tokenizer, model = None, None
    if 'gpt-' in args.model :
        model = openai.OpenAI(
                    # This is the default and can be omitted
                    api_key=os.environ['OPENAI_API_KEY'],
                )
    elif 'starcoder2' in args.model:
        kwargs = {}
        model = LLM(model="bigcode/starcoder2-15b", tokenizer="bigcode/starcoder2-15b", **kwargs)
    else:
        kwargs = {}
        tokenizer = AutoTokenizer.from_pretrained(args.model, token=os.environ['AUTH_TOKEN'], cache_dir=args.cache_dir)
        model = AutoModelForCausalLM.from_pretrained(args.model, token=os.environ['AUTH_TOKEN'], cache_dir=args.cache_dir, device_map='auto', **kwargs)       
    # loop over input files
    os.makedirs(out_folder, exist_ok=True)
    for f in tqdm(in_files):

        base_name = f.split('.')[0]

        test_input = open(f'{test_folder}/{base_name}_in.txt', 'r').read()
        test_output = ''
        if args.use_test:
            test_output = open(f'{test_folder}/{base_name}_out.txt', 'r').read()
        elif args.use_misleading_test:
            test_output = open(f'{test_folder}/{base_name}_misleading_out.txt', 'r').read()

        if len(test_input) > 500 or len(test_output) > 500:
            continue

        prompt_file = f'{in_folder}/{f}'

        with open(prompt_file, "r", encoding="ISO-8859-1", errors='ignore') as fin:
            prompt = fin.readlines()

            if 'CodeLlama' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n"
                else:
                    prompt = f"Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + "\n```\n"
                prompt = f"[INST] <<SYS>>\nYou are an expert {args.target_lang} programmer and assistant\n<</SYS>>\n\n{prompt}[/INST]\n"

            elif 'Magicoder' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.\n\n@@ Instruction\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n\n@@ Response\n"
                else:
                    prompt = f"You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.\n\n@@ Instruction\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + "\n```\n\n@@ Response\n"

            elif 'WizardCoder' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"Below is an instruction that describes a task. Write a response that appropriately completes the request.\n\n### Instruction:\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n\n### Response:\n"
                else:
                    prompt = f"Below is an instruction that describes a task. Write a response that appropriately completes the request.\n\n### Instruction:\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + "\n```\n\n### Response:\n"

            elif 'deepseek-coder' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.\n\n### Instruction:\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n\n### Response:\n"
                else:
                    prompt = f"You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.\n\n### Instruction:\nTranslate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + "\n```\n\n### Response:\n"

            elif 'Mistral' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"[INST] Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n[/INST]\n"
                else:
                    prompt = f"[INST] Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + "\n```\n[/INST]\n"

            elif starcoder in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = f"Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + f"\n```\n\n{args.target_lang} code:"
                else:
                    prompt = f"Translate the following {args.source_lang} code to {args.target_lang} and enclose your solution inside ```{args.target_lang.lower()}```:\n```\n" + "".join(prompt) + f"\n```\n\n{args.target_lang} code:"
                prefix_token = "<fim_prefix>"
                suffix_token = "<fim_suffix><fim_middle>"
                prompt = prefix_token + prompt + suffix_token
            

            elif args.model in ['gpt-4', 'gpt-3.5']:
                if args.use_test or args.use_misleading_test:
                    prompt = "Translate the following code from " + args.source_lang + " to " + args.target_lang + " and enclose your solution inside ```" + args.target_lang.lower() + "```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n"
                else:
                    prompt = "Translate the following code from " + args.source_lang + " to " + args.target_lang + " and enclose your solution inside ```" + args.target_lang.lower() + "```:\n```\n" + "".join(prompt) + "\n```\n"

            elif 'CodeQwen' in args.model:
                if args.use_test or args.use_misleading_test:
                    prompt = "Translate the following code from " + args.source_lang + " to " + args.target_lang + " and enclose your solution inside ```" + args.target_lang.lower() + "```.\nA sample test case is provided below:\n\nTest input:\n" + test_input + "\nExpected output:\n" + test_output + "\n\n```\n" + "".join(prompt) + "\n```\n"
                else:
                    prompt = "Translate the following code from " + args.source_lang + " to " + args.target_lang + " and enclose your solution inside ```" + args.target_lang.lower() + "```:\n```\n" + "".join(prompt) + "\n```\n"
            try:

                if 'starcoder2' in args.model:
                    total_input_tokens = len(model.get_tokenizer().encode(prompt))
                    model_max_length = 2048
                    if total_input_tokens >= model_max_length:
                        out_file = f'{out_folder}/{f.split(".")[0]}.{ext}'
                        with open(out_file, 'w') as fot:
                            print("# Token size exceeded.", file=fot)
                        continue
                    max_new_tokens = model_max_length - total_input_tokens
                    vllm_outputs = model.generate(
                        prompt,
                        SamplingParams(
                            temperature=0.0,
                            max_tokens=max_new_tokens,
                            stop=['<|endoftext|>'],
                            top_p=1.0,
                        ),
                        use_tqdm=False,
                    )

                    gen_strs = [x.outputs[0].text.replace("\t", "    ") for x in vllm_outputs]
                    generated_output = gen_strs[0]

                elif 'gpt' in args.model:
                    try:
                        response = model.chat.completions.create(
                            model="gpt-4-1106-preview" if 'gpt-4' in args.model else "gpt-3.5-turbo",
                            messages=[
                                {
                                    "role": "system",
                                    "content": "You are an expert " + args.target_lang + " programmer and assistant"
                                },
                                {
                                    "role": "user",
                                    "content": prompt
                                }
                            ]
                        )
                        generated_output = response.choices[0].message.content
                    except openai.BadRequestError as e:
                        generated_output = f'token size exceeded. {e}'

                elif args.model in ['codeqwen']:
                    messages=[
                                {
                                    "role": "system",
                                    "content": "You are an expert " + args.target_lang + " programmer and assistant"
                                },
                                {
                                    "role": "user",
                                    "content": prompt
                                }
                            ]
                    text = tokenizer.apply_chat_template(
                        messages,
                        tokenize=False,
                        add_generation_prompt=True
                    )
        
                    model_inputs = tokenizer([text], return_tensors="pt").to("cuda:0")

                    generated_ids = model.generate(
                        model_inputs.input_ids,
                        max_new_tokens=512,
                        temperature = 0,
                        do_sample=False
                    )
                    generated_ids = [
                        output_ids[len(input_ids):] for input_ids, output_ids in zip(model_inputs.input_ids, generated_ids)
                    ]
                    generated_output = tokenizer.batch_decode(generated_ids, skip_special_tokens=True)[0]
                # elif args.model in ['granite']:
                #     messages=[
                #                 {
                #                     "role": "system",
                #                     "content": "You are an expert " + args.target_lang + " programmer and assistant"
                #                 },
                #                 {
                #                     "role": "user",
                #                     "content": prompt
                #                 }
                #             ]
                    text = tokenizer.apply_chat_template(
                        messages,
                        tokenize=False,
                        add_generation_prompt=True
                    )
                    input_tokens = tokenizer(text, return_tensors="pt")
                    for i in input_tokens:
                        input_tokens[i] = input_tokens[i].to("cuda:0")

                    output = model.generate(**input_tokens, max_new_tokens=2048, num_beams=1, do_sample=False)
                    generated_output = tokenizer.batch_decode(output)[0]                                                                 
                else:
                    inputs = tokenizer.encode(prompt, return_tensors="pt").to(device)
                    total_input_tokens = inputs.shape[1]
                    model_max_length = 2048
                    if total_input_tokens >= model_max_length:
                        out_file = f'{out_folder}/{f.split(".")[0]}.{ext}'
                        with open(out_file, 'w') as fot:
                            print("# Token size exceeded.", file=fot)
                        continue
                    max_new_tokens = model_max_length - total_input_tokens

                    raw_outputs = ''
                    raw_outputs = model.generate(
                        inputs,
                        max_new_tokens=max_new_tokens,
                        do_sample=False,
                        pad_token_id=tokenizer.eos_token_id,
                    )

                    generated_output = tokenizer.decode(raw_outputs[0])

                out_file = f'{out_folder}/{f.split(".")[0]}.{ext}'
                with open(out_file, 'w') as fot:
                    print(generated_output, file=fot)

            except (ValueError, FileNotFoundError) as e:
                print(e)
                continue


if __name__ == "__main__":
    load_dotenv()
    parser = argparse.ArgumentParser(description='run translation with open-source models given dataset and languages')
    parser.add_argument('--model', help='model to use for code translation', required=True, type=str)
    parser.add_argument('--dataset', help='dataset to use for code translation', required=True, type=str)
    parser.add_argument('--source_lang', help='source language to use for code translation', required=True, type=str)
    parser.add_argument('--target_lang', help='target language to use for code translation', required=True, type=str)
    parser.add_argument('--gpu_id', help='gpu id to use', default=0, type=int)
    parser.add_argument('--cache_dir', help='cache directory for huggingface models', required=True, type=str)
    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    parser.add_argument('--der', action='store_true')
    args = parser.parse_args()

    # Initialize configurations
    source = args.source_lang
    target = args.target_lang
    logging.info(f"translating examples from {source} to {target} using {args.model} and {args.dataset} dataset")
    main(args)
