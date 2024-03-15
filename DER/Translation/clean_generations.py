import os
from tqdm import tqdm
import re


def load_solutions(samples_dir, ext):
    files = os.listdir(samples_dir)
    solution_paths = []
    for file in files:
        if file.endswith(ext):
            solution_paths.append(os.path.join(samples_dir, file))

    return solution_paths


if __name__ == "__main__":
    import argparse
    import pathlib

    parser = argparse.ArgumentParser()
    parser.add_argument("--samples", type=str, required=True)
    parser.add_argument("--eofs", nargs="+", type=str, default=[])
    parser.add_argument("--remove_prompt", action="store_true")
    parser.add_argument("--source_lang", required=True, type=str, choices=["java", "python"])
    parser.add_argument("--target_lang", required=True, type=str, choices=["java", "python"])
    parser.add_argument("--rm-prefix-lines", nargs="+", type=str, help="Remove lines starting with these string.", default=[])
    args = parser.parse_args()

    EXTENSIONS = { "java": ".java", "python": ".py" }

    # make a new folder with "-sanitized" suffix
    target_path = pathlib.Path(args.samples)
    new_name = target_path.name + "-sanitized"
    target_path = target_path.parent / new_name
    target_path = str(target_path)
    os.makedirs(target_path, exist_ok=True)

    for solution_path in tqdm(load_solutions(args.samples, EXTENSIONS[args.target_lang])):

        filename = os.path.basename(solution_path)

        with open(solution_path, "r") as f:
            solution = f.read()
        old_code = solution

        # start to modify old_code | old_code should not be re-defined

        new_code = old_code

        if args.remove_prompt and ('codellama' in solution_path or 'mistral' in solution_path):
            new_code = new_code[new_code.find("[/INST]") + len("[/INST]"):]
        
        if args.remove_prompt and 'magicoder' in solution_path:
            new_code = new_code[new_code.find("@@ Response") + len("@@ Response"):]
        
        if args.remove_prompt and ('deepseekcoder' in solution_path or 'wizardcoder' in solution_path):
            new_code = new_code[new_code.find("### Response:") + len("### Response:"):]

        if args.remove_prompt and 'starcoder' in solution_path and 'starcoder2' not in solution_path:
            new_code = new_code[new_code.find("<fim_suffix><fim_middle>") + len("<fim_suffix><fim_middle>"):]
        
        if args.remove_prompt and 'llama2' in solution_path:
            new_code = new_code[new_code.find("###") + len("###"):]

        if 'gpt-4' in solution_path or 'gpt-3.5' in solution_path:
            new_code = new_code[new_code.find(f"```{args.target_lang.lower()}") + len(f"```{args.target_lang.lower()}"):
                                new_code.find("```", new_code.find(f"```{args.target_lang.lower()}") + len(f"```{args.target_lang.lower()}"))]

        # basic handling of chat output
        new_code = new_code.replace(f"```{args.target_lang.lower()}", "").replace("```", "").strip()

        for prefix in args.rm_prefix_lines:
            new_code = "\n".join(
                [
                    line
                    for line in new_code.splitlines()
                    if not line.startswith(prefix)
                ]
            ).strip()

        for eof in args.eofs:
            new_code = new_code.split(eof)[0].strip()
        
        if args.target_lang == "java":
            new_code = re.sub('public\s*class\s*.+', 'public class ' + filename.split('.')[0] + ' {', new_code)
        
        with open(target_path + "/" + filename, "w") as f:
            f.write(new_code)
