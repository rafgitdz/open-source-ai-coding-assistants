<div align="center">

# Open source AI coding assistants

**Tabby, Continue.dev and Aider: a free, private, self-hosted alternative to Copilot.**<br>
Ready-to-run configurations and the live demos from the talk, given at Devoxx, Voxxed Days and more.

[![CI](https://github.com/rafgitdz/open-source-ai-coding-assistants/actions/workflows/ci.yml/badge.svg)](https://github.com/rafgitdz/open-source-ai-coding-assistants/actions/workflows/ci.yml)
![license](https://img.shields.io/badge/license-MIT-green)
![local](https://img.shields.io/badge/runs-100%25%20local-informational)

[Watch the talk](#the-talk) · [Quick start](#quick-start) · [Demos](#demos) · [Book this talk](#book-this-talk)

</div>

---

## Why

AI coding assistants are useful, but the default ones send your code to someone
else's cloud, cost a seat per developer and give you little control over how
they behave. This repository shows that a fully open source stack covers most
of the need:

| Tool | Role | Runs in |
|---|---|---|
| [Tabby](./tabby) | Code completion and chat, self-hosted, with an admin console for teams | Your IDE, served from your machine or your server |
| [Continue.dev](./continue) | Chat, edit and agent in the IDE, driven by **versioned team rules** | VS Code, JetBrains |
| [Aider](./aider) | Pair programming in the terminal, edits many files, **one commit per change** | Your terminal |

All three work with local models through [Ollama](https://ollama.com): your code
stays on your machine.

## Quick start

```bash
git clone https://github.com/rafgitdz/open-source-ai-coding-assistants.git
cd open-source-ai-coding-assistants

# Local models
ollama pull qwen2.5-coder:7b
ollama pull qwen2.5-coder:1.5b

# Playground: deliberately poor Java code, with tests as a safety net
cd playground/java-kata && mvn -q test && cd -

# Third-party katas used in the demos (cloned, not vendored)
./scripts/fetch-katas.sh
```

Then pick a tool: [Tabby](./tabby), [Continue.dev](./continue) or [Aider](./aider).

## Demos

| # | Demo | What it shows |
|---|---|---|
| 1 | [Tabby, a Copilot you host yourself](./demos/01-tabby.md) | Completion and chat with Wi-Fi off |
| 2 | [Continue.dev and team rules](./demos/02-continue.md) | Same model, better code once it knows the rules |
| 3 | [Aider in the terminal](./demos/03-aider.md) | From nothing to a game, safe refactoring, a feature in a hexagonal architecture, a security fix |

## Repository layout

```text
tabby/        docker-compose files (GPU, CPU) and native setup on Apple Silicon
continue/     config.yaml for Ollama, team rules, Playwright MCP server
aider/        .aider.conf.yml and the CONVENTIONS.md the model reads on each request
playground/   java-kata: code to refactor live, pinned by characterization tests
demos/        step-by-step scripts of the live demos
scripts/      fetch-katas.sh clones the third-party projects used on stage
```

## The talk

The talk has evolved with the tools, from Tabby alone in 2024 to a full open
source chain in 2025. Every recording below is public.

| Year | Event | Title | Language | Replay |
|---|---|---|---|---|
| 2025 | Codeurs en Seine | AI Coding Assistants: from First Commit to Deployment, 100 % Open Source | FR | [YouTube](https://youtu.be/Zn6nWDPNfks) |
| 2025 | Bordeaux JUG | Tabby & Continue.dev: the Dream Team for an AI Coding Assistant | FR | [YouTube](https://www.youtube.com/watch?v=6wwXVHNrM_o) |
| 2025 | WAX Conference | AI Coding Assistant: Lessons Learned | FR | [YouTube](https://youtu.be/mYnPxe2qrzM) |
| 2025 | Voxxed Days Luxembourg | Aider: Pair Programming with an AI in Your Terminal! | EN | [YouTube](https://youtu.be/9w_I8lyHIN0) |
| 2024 | Devoxx Belgium | Tabby, my free Copilot | EN | [YouTube](https://youtu.be/GFrkmFLU4LI) |
| 2024 | Devoxx France | Tabby, my free Copilot | FR | [YouTube](https://youtu.be/ZAVIXXQDtbM) |
| 2024 | DevFest Strasbourg | Tabby, my free Copilot | FR | [YouTube](https://youtu.be/trKDZBKo2A4) |
| 2024 | Voxxed Days Luxembourg | Tabby, my free Copilot | FR | [YouTube](https://youtu.be/tEuQ7uzquow) |
| 2024 | Volcamp | Tabby, my free Copilot | FR | [YouTube](https://youtu.be/SepRvxK54Rg) |

## Book this talk

Available as a keynote, a 2-hour meetup or a half-day hands-on workshop, in
French or English, on site or remote.

**[Request a quote](https://tally.so/r/Y5LRev)** · [LinkedIn](https://www.linkedin.com/in/rafik-ferroukh) · [YouTube](https://www.youtube.com/@TheUnBullshIT)

## Credits

The demos use these projects, cloned by `scripts/fetch-katas.sh` under their own
licenses: [GildedRose Refactoring Kata](https://github.com/emilybache/GildedRose-Refactoring-Kata)
(Emily Bache), [family-java-bad-code](https://github.com/geektrust/family-java-bad-code)
(Geektrust), [hexagonal-architecture-java](https://github.com/SvenWoltmann/hexagonal-architecture-java)
(Sven Woltmann) and [WebGoat](https://github.com/WebGoat/WebGoat) (OWASP).

## License

[MIT](./LICENSE), for the content of this repository only.
