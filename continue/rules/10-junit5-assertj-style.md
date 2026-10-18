---
name: JUnit 5 + AssertJ Test Style
description: Write readable, deterministic, maintainable tests (JUnit 5, AssertJ, Mockito).
alwaysApply: true
---

## Do
- **AAA**: Arrange–Act–Assert; one behavior per test; explicit test names.
- **AssertJ**: expressive assertions (`assertThat`), with clear failure messages.
- **Mockito**: mock only I/O/external systems; verify essential interactions; `@ExtendWith(MockitoExtension.class)`.
- **Reliability**: no `Thread.sleep`; inject `Clock`/`Random`/seeds; use `@TempDir` for files.
- **Useful coverage**: critical branches, error paths, and happy paths.
- **Test data**: use builders/fixtures; avoid giant inline JSON/XML (prefer utilities).

## Don't
- Don’t test libraries; test your code.
- Don’t lock down implementation details: test **behavior**.
- No unnecessary deep stubbing; prefer simple stubs/fakes.

## Examples
```java
@Test
void merges_pdf_when_inputs_are_valid() {
  // Arrange
  var in1 = new ByteArrayInputStream("A".getBytes());
  var in2 = new ByteArrayInputStream("B".getBytes());

  // Act
  byte[] out = merger.merge(in1, in2);

  // Assert
  assertThat(out).isNotEmpty();
}