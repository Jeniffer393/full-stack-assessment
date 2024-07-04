# Use the official Keycloak image as the base
FROM quay.io/keycloak/keycloak:23.0.6

# Set environment variables if needed (optional)
 ENV KEYCLOAK_ADMIN=admin
 ENV KEYCLOAK_ADMIN_PASSWORD=admin

# Expose the ports your application needs and set up the Keycloak server
EXPOSE 8080
EXPOSE 8443

# Copy custom configuration files or scripts if needed
# COPY config/standalone.xml /opt/jboss/keycloak/standalone/configuration/

# Set the command to start Keycloak in development mode with custom HTTP port
CMD ["start-dev", "--http-port=8180"]
