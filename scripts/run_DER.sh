model=$1
dataset=$2
cache=$3
task=$4
src=$5
tgt=$6
if [ $task == "Synthesis" ]; then
    python synthesis.py --model $model --dataset $datset --cache $cache --use_test
    python clean_generations_synthesis.py --model $model --dataset $dataset --use_test
    python test_synthesis.py --model $model --dataset $dataset --use_test
    python convert_dataset.py --model $model --dataset $dataset --task $task
    python ier.py --model $model --dataset $dataset --task $task 
else
    python translate.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --cache_dir $cache
    python clean_generations_translation.py --samples $dataset --source_lang $src --target_lang $tgt
    python test_translation.py --dataset $dataset --source_lang $src --target_lang $tgt --model $model --test_type no_test
    python convert_dataset.py --model $model --dataset $dataset --task $task
    python ier.py --model $model --dataset $dataset --task $task 
fi