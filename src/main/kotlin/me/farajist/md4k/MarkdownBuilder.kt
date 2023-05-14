package me.farajist.md4k

class MarkdownBuilder {
    val elements: MutableList<MarkdownElement> = mutableListOf()
    fun render(): String = StringBuilder().apply {
        elements.forEach { append(it.toString()) }
    }.toString().trimIndent()
}

fun md(initializer: MarkdownBuilder.() -> Unit): MarkdownBuilder = MarkdownBuilder().apply(initializer)


fun MarkdownBuilder.text(builder: MarkdownElement.() -> String) {
    elements.add(MarkdownText().apply { content = builder.invoke(this) })
}

fun MarkdownBuilder.heading(level: Int, builder: MarkdownElement.() -> String) {
    if (level !in 1..6) throw IllegalStateException("level should be an integer between 1 and 6")
    elements.add(MarkdownText().apply { content = "#".repeat(level) + " " + builder.invoke(this) + '\n' })
}
