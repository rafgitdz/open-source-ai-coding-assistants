#!/usr/bin/env bash
# Clones the third-party projects used in the live demos into ./katas.
# They are not vendored here: each one keeps its own license and authors.
set -euo pipefail

cd "$(dirname "$0")/.."
mkdir -p katas

clone() {
  local url="$1" dir="katas/$(basename "$1")"
  if [ -d "$dir" ]; then
    echo "skip  $dir (already there)"
  else
    git clone --depth 1 "$url" "$dir"
  fi
}

clone https://github.com/emilybache/GildedRose-Refactoring-Kata   # legacy code to refactor
clone https://github.com/geektrust/family-java-bad-code            # smelly Java to clean up
clone https://github.com/SvenWoltmann/hexagonal-architecture-java  # add a feature in a clean architecture
clone https://github.com/WebGoat/WebGoat                           # find and fix security flaws

echo "Done. Katas are in ./katas"
