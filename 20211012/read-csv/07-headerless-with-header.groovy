import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.CsvHelpers
import io.deephaven.qst.column.header.ColumnHeader

header = ColumnHeader.of('Year', int.class)
    .header('Score', byte.class)
    .header('Title', String.class)
    .tableHeader()
csv_specs = CsvSpecs.headerless(header)
//csv_specs = CsvSpecs.builder().hasHeaderRow(false).header(header).build()

deniro = CsvHelpers.readCsv(
    "https://media.githubusercontent.com/media/deephaven/examples/main/DeNiro/csv/deniro_headerless.csv",
    csv_specs)
