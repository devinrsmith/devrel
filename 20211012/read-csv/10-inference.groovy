import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.CsvHelpers
import io.deephaven.db.tables.utils.csv.InferenceSpecs

// string
csv_specs = CsvSpecs.builder().inference(InferenceSpecs.strings()).build()

// instant, long, double
//csv_specs = CsvSpecs.builder().inference(InferenceSpecs.minimal()).build()

// instant, short, int, long, double, bool, char, string
//csv_specs = CsvSpecs.builder().inference(InferenceSpecs.standard()).build()

// instant, instant legacy, instant seconds, instant millis, instant micros, instant nanos,
// short, int, long, double, bool, char, string
//csv_specs = CsvSpecs.builder().inference(InferenceSpecs.standardTimes()).build()

crypto_trades = CsvHelpers.readCsv('/data/CryptoTrades_20210922.csv', csv_specs)
