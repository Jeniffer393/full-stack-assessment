Geojson Footprints Web Service
------------------------------

This project implements a secured web client that displays the footprints received from REST API service on map after authenticating the user. The REST API accepts an area of interest in geojson format via POST request and responds with a JSON object containing a list of geojson footprints.

Setup Instructions:

1. Ensure Docker Engine is Running

2. Clone the Repository :

    Open a terminal or command prompt and run:
   
       git clone https://github.com/Jeniffer393/full-stack-assessment.git
       cd <repository_directory>


3. Run Docker Compose:

       docker-compose up --build
   
   This command starts the frontend (React), backend(Springboot), and Keycloak services defined in the docker-compose.yml file.


4.  Configure Keycloak Setup:
   
    Login Keycloak Administration Console at http://localhost:8180/auth with below details:
    
                                    username: admin
                                    password: adminuser
    
       Click on create realm under top left dropdown using realm_name as "Geocento".
    
       Than, goto Realm settings and select partial import from the "Action" dropdown on Top right corner.
    
       Copy and paste the content of "Geocento-realm.json" file (from Repo) inside the Resource file, tick all the resources you want to import and click import.
    
       Update the password Credentials of user: geouser1 in the Users tab.

6. Access the Application:
   
      Frontend application should be accessible at http://localhost:3000
   
      Backend API should be accessible at http://localhost:8080/geocento/footprint (Secured, cannot be accessed directly)

         
7. Authenticate and Use the Application:
    
      Open the frontend application in your browser.
      Authenticate using the geouser1 user credentials set up in Keycloak.
      Once authenticated, the frontend will call the backend API to retrieve geojson footprints and display them on a Leaflet map.

8. API Documentation:

    Access the OpenAPI documentation at http://localhost:8080/swagger-ui.html 
