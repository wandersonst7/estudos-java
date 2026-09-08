# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Idioma

Responda sempre em pt-br (português do Brasil), independentemente do idioma usado na pergunta.

## Project purpose

This is a study/reference project for modern Java language features (Java 17, targeting JDK 17 per `.idea/misc.xml`). It is not an application — `Main.java` is a scratchpad that exercises one feature at a time, and each class under `src/Classes` and `src/Utils` exists to demonstrate a single language construct with an explanatory comment block above the declaration. When adding new examples, follow this same pattern: one concept per class, with a comment block explaining what the feature is and why/when to use it (see `Animal.java`, `PessoaRecord.java`, `Utils/Yield.java` for the established style/tone, written in Portuguese).

## Build and run

There is no build tool (no Maven/Gradle) — this is a plain IntelliJ IDEA JDK module (`04-revisao-java-moderno.iml`), source root is `src/`, compiled output goes to `out/`.

Compile and run from the command line:

```bash
javac -d out/production/04-revisao-java-moderno -cp src $(find src -name "*.java")
java -cp out/production/04-revisao-java-moderno Main
```

Or open/run directly via IntelliJ IDEA (JDK 17), which is the primary intended workflow — `Main.main()` is the entry point.

There are no tests and no linter configured in this project.

## Code architecture

- `src/Main.java` — entry point; sequentially demonstrates each language feature by calling into the classes below. New feature demos should be wired in here.
- `src/Classes/` — one class per concept:
  - `Pessoa.java` vs `PessoaRecord.java` — plain class with manual boilerplate vs. an equivalent `record`, contrasted directly.
  - `Animal.java` / `Mamifero.java` / `Ave.java` / `Leao.java` / `Pato.java` — a `sealed` class hierarchy demonstrating `sealed`/`permits`/`non-sealed`/`final`: `Animal` is `sealed permits Mamifero, Ave`; both `Mamifero` and `Ave` are declared `non-sealed` (reopening inheritance); `Leao` and `Pato` are `final` leaves.
  - `DiaSemana.java` — basic `enum` example.
- `src/Utils/Yield.java` — contrasts classic `switch` statements with `switch` expressions and the `yield` keyword (`switchComum` vs `switchAprimorado` vs `usoDoYield`).

Package names (`Classes`, `Utils`) are capitalized, matching this project's existing convention — keep new packages consistent with that rather than the more common lowercase Java convention.
