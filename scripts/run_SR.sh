model=$1
dataset=$2
cache=$3
task=$4
sr_type=$5
src=$6
tgt=$7

if [ $task == "Synthesis" ]; then
    python synthesis.py --model $model --dataset $datset --cache $cache ---$sr_type
    python clean_generations_synthesis.py --model $model --dataset $dataset --$sr_type
    python test_synthesis.py --model $model --dataset $dataset --$sr_type --test_one
else
    python translate.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --cache_dir $cache --$sr_type
    python clean_generations_translation.py --model $model --dataset $dataset --source_lang $src --target_lang $tgt --$sr_type
    python test_translation.py --dataset $dataset --source_lang $src --target_lang $tgt --model $model --test_type $sr_type

fi