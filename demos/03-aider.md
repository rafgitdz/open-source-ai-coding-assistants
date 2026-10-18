# Demo 3: Aider in the terminal

**Goal:** show an assistant that edits many files and commits each change.

**Setup:** `./scripts/fetch-katas.sh`, Ollama running, `aider/.aider.conf.yml`
and `aider/CONVENTIONS.md` copied into the target repository.

## 3.1 From nothing to a game (2 minutes)

```text
mkdir snaky && cd snaky && git init && aider
> make a python snake game with pygame
> /run python snake_game.py
> What's wrong? Fix it
```

Point to make: `/run` feeds the error back to the model. `git log` shows one
commit per step, `/undo` reverts the last one.

## 3.2 Refactor without breaking anything (`playground/java-kata`)

```text
> /add src/main/java/dev/rafik/kata/Calculator.java
> refactor Calculator.java
> /test
> refactor again using a Map<String, IntBinaryOperator> of operations
```

Point to make: ask for a second refactoring when the first one is not good
enough. The characterization tests keep both honest.

## 3.3 Add a feature in a clean architecture (`katas/hexagonal-architecture-java`)

```text
> /add **/*.java
> Add a low-stock threshold per product and expose an endpoint listing the products under their threshold
```

Point to make: does the assistant respect the ports and adapters, or does it
take shortcuts? Read the diff before accepting.

## 3.4 Security review (`katas/WebGoat`)

```text
> /ask tell me the security vulnerability in SqlInjectionLesson10.java
> /code
> fix it
```

Point to make: `/ask` to understand, `/code` to change. The fix still needs a
human review: the model is fast, not accountable.
