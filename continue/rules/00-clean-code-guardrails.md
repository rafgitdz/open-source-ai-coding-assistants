---
name: Clean Code Guardrails (KISS/DRY/SOLID)
description: Systematically apply KISS, DRY, SOLID and readability/maintainability practices to every diff.
alwaysApply: true
---

## Scope
Applies to all Java/Quarkus code in the repo (production + tests).

## Do (mandatory)
- **KISS**: prefer the simplest solution that meets the need; remove accidental complexity.
- **DRY**: deduplicate by extraction (method/class/utility) or parametrization; avoid copy-paste.
- **SOLID**:
    - Single Responsibility: one class → one reason to change.
    - Open/Closed: open to extension, closed to modification (strategy, polymorphism).
    - Liskov: no subtypes that break invariants.
    - Interface Segregation: small, focused interfaces.
    - Dependency Inversion: depend on abstractions, not concretes.
- **Readability first**: clear names, short functions, early returns, no hidden side effects.
- **Error handling**: explicit exceptions with actionable messages; log via SLF4J at appropriate levels.
- **Null-safety**: avoid `null` in public APIs; prefer `Optional` for controlled absence or value objects.
- **Immutability**: prefer `final` fields, immutable objects, and unmodifiable collections on outputs.
- **Complexity**: aim for methods ≤ ~30 lines and low cyclomatic complexity; extract otherwise.
- **Contracts**: validate inputs (preconditions) and cover them with tests.

## Don't
- No premature optimizations or unnecessary patterns/micro-abstractions.
- No global/static mutable state.
- Don’t stack multiple abstraction levels in the same method.
- Don’t use comments to compensate unclear code: rename/refactor instead.

## Examples
- Anti-pattern: 200-line method mixing parsing, validation, I/O, and orchestration → **extract** by responsibilities.
- Pattern: extract a `DocumentMerger` interface + implementations that are unit-testable.