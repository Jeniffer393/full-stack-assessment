import Keycloak from 'keycloak-js';

const keycloakConfig = new Keycloak({
  url: 'http://localhost:8180/',
  realm: 'Geocento',
  clientId: 'GeoFront'
});

export default keycloakConfig;
