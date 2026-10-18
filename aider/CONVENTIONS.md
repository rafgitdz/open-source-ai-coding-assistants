# Coding conventions

Aider reads this file on every request (see `read:` in `.aider.conf.yml`).
Keep it short: the model follows ten clear rules better than fifty vague ones.

- Java 21. Prefer records and immutable objects.
- One behavior per method, methods under 30 lines.
- No `null` in public APIs: use `Optional` for a missing value.
- Every change comes with a test (JUnit 5, AssertJ), Arrange, Act, Assert.
- Never change a public signature without saying so in the commit message.
- Commit messages follow Conventional Commits (`feat:`, `fix:`, `refactor:`).
