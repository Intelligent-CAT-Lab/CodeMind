

for dataset in avatar codenet; do
    for src_lang in java python; do
        for tgt_lang in python java; do
            if [ $src_lang == $tgt_lang ]; then
                continue
            fi
            echo "Cleaning $dataset from $src_lang to $tgt_lang"
            python3 DER/Translation/clean_generations.py --samples=translation_output/codellama/$dataset/${src_lang}/${tgt_lang} \
                                                        --source_lang=${src_lang} \
                                                        --target_lang=${tgt_lang} \
                                                        --remove_prompt \
                                                        --rm-prefix-lines "I" "Note" "This" "Also" "Here" "Finally" \
                                                        --eofs "Explanation" "1." "* Python" "The"
        done
    done
done
