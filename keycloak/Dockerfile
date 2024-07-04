FROM quay.io/keycloak/keycloak:23.0.6

 ENV KEYCLOAK_ADMIN=admin
 ENV KEYCLOAK_ADMIN_PASSWORD=admin@123

EXPOSE 8080
EXPOSE 8443

CMD ["start-dev", "--http-port=8180"]
