import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.CsvHelpers

csv_specs = CsvSpecs.tsv()
//csv_specs = CsvSpecs.builder().delimiter('\t' as char).build()

deniro = CsvHelpers.readCsv(
    "https://raw.githubusercontent.com/deephaven/examples/main/DeNiro/csv/deniro.tsv",
    csv_specs)