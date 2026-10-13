# core-java-ref

Core Java reference examples, grouped by topic. Each topic is a Maven module,
and every example is a small class with its own `main` method that you can
build and run on its own.

## Requirements

- JDK 24 (`java -version`)

Maven is not required; the included Maven Wrapper (`./mvnw`) downloads it on first use.

## Run an example

```bash
./run                               # list every topic and its examples
./run streams                       # list the examples in one topic
./run streams JavaStreamMapExample  # build that topic and run one example
```

Anything after the example name is passed to the program as arguments.

The `run` script is a bash script (macOS, Linux, Git Bash or WSL on Windows).
Without it, the equivalent is:

```bash
./mvnw -q -pl streams compile
java -cp streams/target/classes com.fullstacksref.streams.JavaStreamMapExample
```

To build everything: `./mvnw verify`

## Topics

| Topic | What it covers |
|---|---|
| [collections](collections) | `ArrayDeque`, iterating and removing `Map` entries, short-circuit operators |
| [concurrency](concurrency) | Virtual threads vs platform threads, scoped values |
| [lambdas](lambdas) | Functional interfaces, `forEach` |
| [language-features](language-features) | Flexible constructor bodies, unnamed patterns, runtime version |
| [numbers](numbers) | Random number generation |
| [records](records) | Records, compact and custom constructors, records implementing interfaces |
| [streams](streams) | `map`, `flatMap`, `filter`, `reduce`, collectors, summary statistics |

[jpms-demo](jpms-demo) is a separate, hand-built Java module (`module-info.java`)
example that is not part of the Maven build; see its README.

## Preview features

`concurrency` and `language-features` use features that are still in preview on
JDK 24 (scoped values, statements before `super(...)`). Their `pom.xml` compiles
with `--enable-preview`, and `./run` passes the same flag when it starts them.
On JDK 25 these features are final: remove the flag from those two poms and set
`maven.compiler.release` to 25 in the root `pom.xml`.

## Add an example

Create a class with a `main` method in the topic's package, for example
`streams/src/main/java/com/fullstacksref/streams/MyExample.java`. It shows up
in `./run streams` automatically.

## Add a topic

1. Copy an existing module's `pom.xml` into a new folder, e.g. `strings/pom.xml`,
   and change its `<artifactId>` to `strings`.
2. Add `<module>strings</module>` to the root `pom.xml`.
3. Put examples under `strings/src/main/java/com/fullstacksref/strings/`.

A topic that needs a third-party library declares it in its own `pom.xml`;
`./run` picks the dependencies up automatically.

## License

MIT, see [LICENSE](LICENSE).
