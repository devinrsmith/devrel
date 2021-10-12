# TODO: coming soon (*)
crypto_trades_via_header = read_csv('/data/CryptoTrades_20210922.csv', header={
    'Date': dh.string,
    'Timestamp': dh.instant,
    'Instrument': dh.string,
    'Exchange': dh.string,
    'Price': dh.float,
    'Size': dh.float })