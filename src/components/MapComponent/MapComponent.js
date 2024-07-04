import React, { useEffect, useState } from 'react';
import { MapContainer, TileLayer, Polygon, Popup,Marker } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import axios from 'axios';
 import keycloakConfig from '../../config/keycloakConfig';

const MapComponent = () => {
  const [footprints, setFootprints] = useState([]);

  useEffect(() => {
    if (keycloakConfig.authenticated) {
      const fetchData = async () => {
        const token = keycloakConfig.token;
        const headers = { Authorization: `Bearer ${token}`,
            "Access-Control-Allow-Origin": "*"            
        
      };
        const response = await axios.post('http://localhost:8080/geocento/footprint', { 
            "type": "FeatureCollection",
            "features": [
                {
                    "type": "Feature",
                    "geometry": {
                        "type": "Polygon",
                        "coordinates": [
                            [
                              [53.09051246499908,-4.122169673877181],
                              [51.05701477929102, -2.676430417888554],
                              [52.049136396736486, 0.09725591404151146],
                              [ 53.80482160830206, -0.3739477627277097],
                              [54.78600462975231, -3.1155062790178647],
                              [ 53.09051246499908, -4.122169673877181]
                            ]
                        ]
                    }
                }                
            ]
        } , { headers });
        setFootprints(response.data.features);
      };
      fetchData();
    }
  }, [keycloakConfig.authenticated]);

  return (

    <MapContainer center={[ 52.7, -2.22]} zoom={6} style={{ height: '100%', width: '100%' }}>
      <TileLayer
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />
      {footprints.map(feature => 
        <Polygon positions={ feature.geometry.coordinates[0]} color='red' fillColor='red' />
      )}
    </MapContainer>
  );
};

export default MapComponent;
