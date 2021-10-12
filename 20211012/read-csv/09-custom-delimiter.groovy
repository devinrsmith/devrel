import io.deephaven.db.tables.utils.csv.CsvSpecs
import io.deephaven.db.tables.utils.CsvHelpers

csv_specs = CsvSpecs.builder().delimiter(' ' as char).build()

twitch_gross_earnings = CsvHelpers.readCsv("https://sizeof.cat/post/twitch-leaks/files/pastebin.txt", csv_specs)
    .dropColumns("Username", "UserID")
    .where("GrossEarning < 10000000") // remove outliers

twitch_plot = plot("Twitch", twitch_gross_earnings, "Rank", "GrossEarning").show()