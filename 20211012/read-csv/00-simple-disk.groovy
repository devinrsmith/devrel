import io.deephaven.db.tables.utils.CsvHelpers

the_pirate_bay = CsvHelpers.readCsv('/data/20081205_thepiratebay.csv')
the_pirate_bay_categories = the_pirate_bay.selectDistinct('category').sort('category')
the_pirate_bay_averages = the_pirate_bay.view('avg_size=size', 'avg_seeders=seeders', 'avg_leechers=leechers').avgBy()
the_pirate_bay_outliers = the_pirate_bay
    .naturalJoin(the_pirate_bay_averages, "")
    .where("seeders >= 500 * avg_seeders", "leechers >= 500 * avg_leechers")
    .sortDescending("seeders")