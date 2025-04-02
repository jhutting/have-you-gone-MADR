package io.github.jhutting.madr.javadoc;

/// Starting with _Java 23_ and beyond you can use Markdown to write your JavaDocs.
///
/// ```
///     // Example usage:
///     var value = new MarkdownDocumented(1, "test");
/// ```
///
/// ### Example data
/// | id | name             |
/// | -- | ---------------- |
/// | 1  | test             |
/// | 2  | another test     |
///
/// @param id an example `Id` - and yes, you can still use this _JavaDoc_ identifier
/// @param name And the name linking to that [id](#id), or was it [id()](#id())?
public record MarkdownDocumented(long id, String name) {
}
