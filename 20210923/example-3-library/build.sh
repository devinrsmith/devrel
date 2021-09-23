#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

docker build --tag devinrsmith/devrel-20210923:example-3-library "${__dir}"