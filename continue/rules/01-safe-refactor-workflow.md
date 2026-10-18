---
name: Safe Refactor Workflow
description: A step-by-step procedure to refactor without changing observable behavior.
alwaysApply: true
---

## Do (workflow)
1) **Safety net**: run all tests; add missing tests that capture the current behavior.
2) **Small steps**: slice into atomic changes (rename → extractions → move → inject…).
3) **Guards**: commit incrementally and run tests between each step.
4) **Non-functional**: do not change public APIs or visible I/O without a dedicated rule/PR.
5) **Measure**: watch coverage/complexity; if it worsens, revert/extract.
6) **Review**: clear PR description (Conventional Commits), identified risks, rollback plan.

## Don't
- Don’t mix refactors with features/bugfixes in the same commit/PR.
- Don’t accept lower test coverage or readability as a trade-off.

## Examples
- Before: one method does validation + mapping + I/O → After: `Validator`, `Mapper`, `Repository` injected; thin orchestration in controller.