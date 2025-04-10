model=$1
dataset=$2
cache=$3
sr_type=$4


if [ $sr_type == "use_test" ]; then
    python sr.py --model $model --dataset $dataset --cache $cache --use_test
    python test_synthesis.py --model $model --dataset $dataset --use_test
else
    python sr.py --model $model --dataset $dataset --cache $cache
    python test_synthesis.py --model $model --dataset $dataset
fi