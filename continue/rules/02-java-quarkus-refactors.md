---
name: Java/Quarkus Refactor Idioms
description: Refactoring guidelines specific to Java/Quarkus for testable and robust code.
alwaysApply: false
---

## Do
- **Injection**: prefer constructor/CDI injection in Quarkus; avoid static fields for dependencies.
- **Resources**: use `try-with-resources` for `InputStream`/`Reader`; close/propagate properly.
- **Exceptions**: domain-specific exceptions with useful messages; controlled wrapping for I/O.
- **Logging**: SLF4J (`info` for business flow, `debug` for details, `warn` for anomalies, `error` for blocking errors); never `printStackTrace`.
- **Value objects**: use records/immutable POJOs for data; builders for complex aggregates.
- **Collections**: use interfaces (`List`, `Map`) in signatures; return immutable views.
- **Streams**: favor readability (name lambdas, factor common steps).
- **Date/Time**: use `java.time` with an injected `Clock` for deterministic tests.
- **Heavy I/O**: isolate in ports/adapters; test via doubles/mocks.
- **HTTP tests**: for REST, use RestAssured under `@QuarkusTest` and `@TestHTTPEndpoint`.

## Don't
- Don’t `new` business dependencies directly inside application logic (prefer injection).
- Avoid `Optional` as fields; reserve it for API return types or optional inputs.
- Don’t share mutable objects across threads without protection (prefer immutability/guards).