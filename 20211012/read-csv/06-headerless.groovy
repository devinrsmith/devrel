import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.CsvHelpers

csv_specs = CsvSpecs.headerless()
//csv_specs = CsvSpecs.builder().hasHeaderRow(false).build()

deniro = CsvHelpers.readCsv(
    "https://media.githubusercontent.com/media/deephaven/examples/main/DeNiro/csv/deniro_headerless.csv",
    csv_specs)

deniro = deniro.view("Year=Column1", "Score=Column2", "Title=Column3")