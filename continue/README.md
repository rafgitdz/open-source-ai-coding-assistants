# Continue.dev: an open source assistant you can configure

[Continue](https://github.com/continuedev/continue) is an open source IDE
extension (VS Code, JetBrains). It talks to the model of your choice, including
local ones through [Ollama](https://ollama.com).

What makes it useful in a team is not the model, it is the **rules**: versioned
Markdown files that tell the assistant how your team writes code.

## Install

```bash
ollama pull qwen2.5-coder:7b
ollama pull qwen2.5-coder:1.5b
cp -r continue/ /path/to/your/project/.continue
```

Install the Continue extension, then reload the IDE.

## The rules in this folder

| Rule | Always on | Purpose |
|---|---|---|
| `00-clean-code-guardrails.md` | yes | KISS, DRY, SOLID on every diff |
| `01-safe-refactor-workflow.md` | yes | Refactor in small steps behind a safety net of tests |
| `02-java-quarkus-refactors.md` | no | Java and Quarkus idioms (injection, resources, `java.time`) |
| `10-junit5-assertj-style.md` | yes | Readable, deterministic tests |
| `11-tdd-guardrails.md` | no | Red, green, refactor |
| `12-quarkus-integration-tests.md` | no | REST and database integration tests |

`mcpServers/playwright-mcp.yaml` gives the agent a browser through the
[Playwright MCP server](https://github.com/microsoft/playwright-mcp).

## What to try

See [`../demos/02-continue.md`](../demos/02-continue.md).
