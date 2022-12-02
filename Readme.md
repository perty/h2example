# H2 example with Spring boot

## Purpose

Try using H2 to store data in a file easily. Evaluate how this works with schema migration by Flyway. Evaluate if it is feasible for running in cheap cloud environment, such as [fly.io](https://fly.io), instead of Postgres in a separate process.

Deployment with a Docker image that has the datastore mounted.

Use this in a class for beginners. 

## Notes

The file path can not be relative, it has to be absolute.

The H2 console works although not the prettiest thing seen. Can it be made simpler for beginners? It is built in JSP! Oops.

Using IntelliJ's database tools seems to work fine, like any other database.

If I have a connection to the file-db already, I can't start a new process that connects to it. File is probably locked, good.


