from deephaven.TableTools import newTable as new_table, stringCol as string_col
from deephaven.TableTools import readCsv as read_csv

def get_inputs_manual():
    return new_table(string_col("Input",
        "124 NE Morgan Ln, Grants Pass, OR 97526",
        "111 NE Mill St, Grants Pass, OR 97526",
        "1767 N Riverside Ave, Medford, OR 97501",
        "500 Queen Anne Ave N, Seattle, WA 98109",
        "1912 Pike Pl, Seattle, WA 98101",
        "60 E Broadway, Bloomington, MN 55425",
        "1805 N 30th St, Colorado Springs, CO 80904"))

def get_inputs():
    return read_csv('inputs.csv')



































# inputs = get_inputs()
# inputs_manual = get_inputs_manual()