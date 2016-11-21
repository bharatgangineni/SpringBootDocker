# SpringBootDocker

This is a simple spring boot rest micro service application. Also configured a dockerfile to host this application on docker daemons. before hosting we have to create the dockerimage using docker and than deploy that image file on multiple instance of docker daemons based on the load to the service. steps involved in creating the dockerimage as follows.

1. build the jar file for the spring boot application using any build tool like maven/gradle.
2. run this command in docker terminal 
        docker build -f Dockerfilename -t applicationname
3. check the image file created in docker by running this command in terminal
        docker images
  this gives a list of image file in docker you should find the imagefile with name as applicationname
4. Now you can host this image file on the given port by using this command
        docker run -p 8080:8080 applicaitonname
5. you can test this service by entering the dockermachine Ip with the respective portnumber in any rest client.
        <docker-machineIP>:<exposedport>
