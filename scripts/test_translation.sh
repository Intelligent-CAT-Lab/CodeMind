
model=$1
test_type=$2

for dataset in avatar codenet; do
    for src_lang in java python; do
        for tgt_lang in python java; do

            if [ $src_lang == $tgt_lang ]; then
                continue
            fi

            echo "Testing $model on $dataset from $src_lang to $tgt_lang"
            python3 DER/Translation/test.py --dataset=$dataset --source_lang=$src_lang --target_lang=$tgt_lang --model=$model --report_dir=translation_stats --test_type=$test_type
        done
    done
done
