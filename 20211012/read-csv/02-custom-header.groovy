import io.deephaven.db.tables.utils.CsvHelpers
import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.qst.column.header.ColumnHeader

header = ColumnHeader.of('Date', String.class)
    .header('Timestamp', java.time.Instant)
    .header('Id', String.class)
    .header('Instrument', String.class)
    .header('Exchange', String.class)
    .header('Price', float.class)
    .header('Size', float.class)
    .tableHeader()

csv_specs = CsvSpecs.builder().header(header).build()

crypto_trades_via_header = CsvHelpers.readCsv('/data/CryptoTrades_20210922.csv', csv_specs)
