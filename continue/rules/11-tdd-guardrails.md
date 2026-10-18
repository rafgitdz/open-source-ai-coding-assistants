---
name: TDD Guardrails
description: Before implementing/refactoring, write a failing test that captures the need/bug, then make it pass, then refactor.
alwaysApply: false
---

## Do
- Write a **red** test targeting the requirement/bug.
- Implement **just enough** to turn it **green**.
- Refactor while keeping the suite green (red–green–refactor loop).

## Don't
- Don’t patch production code without a test.