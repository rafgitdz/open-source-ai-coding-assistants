# Aider: pair programming with an AI in your terminal

[Aider](https://github.com/Aider-AI/aider) is an open source assistant that runs
in the terminal, edits files across your repository and commits each change.

## Install

```bash
python -m pip install aider-install && aider-install
ollama pull qwen2.5-coder:7b
cp aider/.aider.conf.yml /path/to/your/repo/
```

Small local models need a larger context window to see enough of your code. If
answers look truncated, add a `.aider.model.settings.yml` next to the config:

```yaml
- name: ollama_chat/qwen2.5-coder:7b
  extra_params:
    num_ctx: 65536
```

## Commands used in the talk

| Command | What it does |
|---|---|
| `/add <files>` | Put files in the chat so Aider can edit them |
| `/ask` | Ask a question without touching the code |
| `/code` | Switch back to editing |
| `/run <cmd>` | Run a command and share its output with the model |
| `/lint`, `/test` | Run the linter or the tests and fix what fails |
| `/undo` | Revert the last commit made by Aider |
| `/voice` | Dictate your request |

## What to try

See [`../demos/03-aider.md`](../demos/03-aider.md).
