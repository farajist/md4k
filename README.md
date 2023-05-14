# ⬇️ md4k: kotlin markdown DSL

Kotlin official extensions already provide a DSL for building HTML, why not make one for Markdown ?
Markdown is pretty human-readable itself so having this DSL would probably only make sense when a programmatic
solution is required.

The aim of this project is putting some Kotlin-specific language features geared towards building DSL-style APIs, mainly:
_lambdas with receivers_ and _invoke_ pattern.

## How it works ?

```kotlin
    val document = md {
        heading(level = 1) { "This is a title" }
        text { "How being a little " + "bold".b() + " ?"}
    }   
```

You get the gist now ? Check the docs for the rest 😉
## Roadmap
>TODO****