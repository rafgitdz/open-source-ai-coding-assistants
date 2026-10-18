# Tabby: a self-hosted Copilot

[Tabby](https://github.com/TabbyML/tabby) is an open source, self-hosted code
completion and chat server. Your code never leaves your machine or your network.

## Run it

| Machine | Command |
|---|---|
| Linux + NVIDIA GPU | `docker compose -f tabby/docker-compose.yml up -d` |
| Any machine, CPU only | `docker compose -f tabby/docker-compose.cpu.yml up -d` |
| Apple Silicon (Metal) | `brew install tabbyml/tabby/tabby` then `tabby serve --device metal --model StarCoder-1B --chat-model Qwen2-1.5B-Instruct` |

Docker on macOS cannot reach the Apple GPU, so on a Mac run Tabby natively with
`--device metal`.

Then:

1. Open <http://localhost:8080>, create the admin account and copy your token.
2. Install the Tabby extension in your IDE (VS Code, IntelliJ, Vim/Neovim).
3. Point it to `http://localhost:8080` with the token.

## What to try

See [`../demos/01-tabby.md`](../demos/01-tabby.md).

## Choosing a model

Small models (1B to 3B) answer fast enough for completion on a laptop. Larger
models give better chat answers but need a GPU. The list of supported models is
in the [Tabby model registry](https://tabby.tabbyml.com/docs/models/).
