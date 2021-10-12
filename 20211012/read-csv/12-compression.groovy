import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.csv.InferenceSpecs


my_inference = InferenceSpecs.builder().addParsers(
    Parser.INT,
    Parser.LONG,
    MyCustomParser,
    Parser.STRING).build()

the_defaults = CsvSpecs.builder()
    .inference(InferenceSpecs.standardTimes())
    .hasHeaderRow(true)
    .delimiter(',' as char)
    .quote('"' as char)
    .ignoreSurroundingSpaces(true)
    .trim(false)
    .charset(java.nio.charset.StandardCharsets.UTF_8)
    .build()

custom_parsers = CsvSpecs.builder()
    .putParsers("MyColumn", myCustomParser)
    .build()