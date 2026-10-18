# Demo 1: Tabby, a Copilot you host yourself

**Goal:** show that code completion and chat work with nothing leaving the laptop.

**Setup:** Tabby running (see [`../tabby`](../tabby)), IDE extension connected,
`playground/java-kata` open.

| Step | Do | Point to make |
|---|---|---|
| 1 | Turn off Wi-Fi | Everything that follows runs locally |
| 2 | In `Validators.java`, type `public static boolean isValidEmail(` and wait | Inline completion from a 1B model, in under a second |
| 3 | Accept, then type the Javadoc of `isValidFrenchPostalCode` and let Tabby write the body | The comment is the prompt |
| 4 | Open the Tabby chat: "Write JUnit 5 tests for Validators" | Chat and completion share the same context |
| 5 | Run `mvn -q test` | Never trust generated code before the tests say so |
| 6 | Open the Tabby admin page: users, usage, repository indexing | What a team gets on top of a solo setup |
