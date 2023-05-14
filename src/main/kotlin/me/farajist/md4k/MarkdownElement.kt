package me.farajist.md4k

@MarkdownElementMarker
interface MarkdownElement {
    fun String.b(): String = "**${this}**"
    override fun toString(): String
}

class MarkdownText: MarkdownElement {
    lateinit var content: String
    override fun toString(): String = content
}