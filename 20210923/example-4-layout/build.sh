#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

docker build --tag devinrsmith/web-devrel-20210923:example-4-layout "${__dir}"