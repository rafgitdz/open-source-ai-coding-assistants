---
name: Quarkus Integration Tests
description: Rules for REST/DB integration tests with Quarkus.
alwaysApply: false
---

## Do
- Use `@QuarkusTest` to load the context; manage a `application-test.yaml` profile.
- **REST**: RestAssured + `@TestHTTPEndpoint`; verify status, headers, and payload.
- **DB**: Testcontainers or dedicated H2/Postgres profiles; seeded datasets; rollback-per-test where possible.
- **External systems**: WireMock / `@QuarkusTestResource` to emulate remote services.
- **Traceability**: concise yet useful test logs; correlation IDs if relevant.

## Don't
- Don’t rely on uncontrolled live network services in CI tests.