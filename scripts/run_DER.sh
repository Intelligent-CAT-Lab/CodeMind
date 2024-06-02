model=$1
dataset=$2
cache=$3
task=$4
src=$5
tgt=$6
if [ $task == "Synthesis" ]; then
    python synthesis.py --model $model --dataset $datset --cache $cache --use_test --der
    python clean_generations_synthesis.py --model $model --dataset $dataset --use_test --der
    python test_synthesis.py --model $model --dataset $dataset --use_test --der
    python convert_dataset.py --model $model --dataset $dataset --task $task
    python ier.py --model $model --dataset $dataset --cache $cache --task $task --der
else
    python translate.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --cache_dir $cache --der
    python clean_generations_translation.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --remove_prompt --der
    python test_translation.py --dataset $dataset --source_lang $src --target_lang $tgt --model $model --test_type no_test --der
    python convert_dataset.py --model $model --dataset $dataset --task $task --src $src --tgt $tgt
    python ier.py --model $model --dataset $dataset --cache $cache --task $task --pl $tgt --der
fi