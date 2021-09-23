from deephaven.TableTools import readCsv as read_csv

from geopy import distance as geo_dist
from geopy.geocoders import Nominatim

def get_inputs():
    return read_csv('inputs.csv')

def geocode(input, user_agent="Devin's DevRel Learning 20210923"):
    geolocator = Nominatim(user_agent=user_agent)
    location = geolocator.geocode(input)
    return (location.address.split(',')[0], (location.latitude, location.longitude)) if location else None

def get_name(t):
    return t[0] if t else None

def get_latitude(t):
    return t[1][0] if t else None

def get_longitude(t):
    return t[1][1] if t else None

def distance(lat1, lon1, lat2, lon2):
    return geo_dist.distance((lat1, lon1), (lat2, lon2)).miles

def add_geo_info(table):
    return table.update(
        "Tmp=geocode.call(Input)",
        "Name=(String)get_name.call(Tmp)",
        "Latitude=(double)get_latitude.call(Tmp)",
        "Longitude=(double)get_longitude.call(Tmp)")\
        .dropColumns("Tmp")

def distance_matrix(locations):
    return locations\
        .join(locations, "", "Name2=Name,Latitude2=Latitude,Longitude2=Longitude")\
        .where("Name < Name2")\
        .update("Distance=(double)distance.call(Latitude, Longitude, Latitude2, Longitude2)")\
        .view("Name1=Name", "Name2", "Distance")












# inputs = get_inputs()
# inputs_with_info = add_geo_info(inputs)
# distances = distance_matrix(inputs_with_info)