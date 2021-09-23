#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

docker tag devinrsmith/devrel-20210923:example-3-library ghcr.io/devinrsmith/grpc-api-geo:latest

docker tag devinrsmith/web-devrel-20210923:example-4-layout ghcr.io/devinrsmith/web-geo:latest

docker push ghcr.io/devinrsmith/grpc-api-geo:latest

docker push ghcr.io/devinrsmith/web-geo:latest
