#!/bin/bash

SCORE="$SCORE" # Fetch the score from the environment variable

if [[ -z "$SCORE" ]]; then
  SCORE=0
fi

echo "The score is: $SCORE"
# Perform any other operations or logic based on the score
