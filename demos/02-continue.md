# Demo 2: Continue.dev and team rules

**Goal:** show that the same model writes better code once it knows the team's rules.

**Setup:** Ollama running, `continue/` copied to `playground/java-kata/.continue`.

| Step | Do | Point to make |
|---|---|---|
| 1 | Move `.continue/rules` away. Select `Calculator.java`, ask "Refactor this class" | Without rules: a rewrite in one go, tests not run, public API changed |
| 2 | `git checkout .`, put the rules back, ask the same thing | With `01-safe-refactor-workflow.md`: small steps, tests first, signatures kept |
| 3 | Run `mvn -q test` | The characterization tests in `CalculatorTest` are the safety net |
| 4 | Ask "Add Javadoc and tests to Validators" | `10-junit5-assertj-style.md` shapes the tests (AAA, AssertJ, explicit names) |
| 5 | Ask the agent to open a page in the browser | The Playwright MCP server gives the assistant a real browser |

**Takeaway:** the rules are plain Markdown in the repository. They get reviewed
like code, and they work with any model.
