import React from 'react';
import MapComponent from '../components/MapComponent/MapComponent';
import { useKeycloak } from '@react-keycloak/web';
import './OpenMap.css'


const OpenMap = () => {

  const { keycloak, initialized } = useKeycloak();

  if (!initialized) {
    return <div>Loading...</div>;
  }

  if (!keycloak.authenticated) {
    keycloak.login();
  }

  const handleLogout = () => {
    keycloak.logout();
  };

  return (
    <div>
      <div className="toolbar">
        <div className="toolbar-title"><strong>GeoCento</strong></div>
        <button className="logout-button" onClick={handleLogout}>
          Logout
        </button>
      </div>
      <div className='window-body'>
      <div className="map-frame">
        <MapComponent keycloak={keycloak} />
      </div>
      </div>
    </div>
    );
};

export default OpenMap;
