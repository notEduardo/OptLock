# Optimistic Lock

This is a spring boot application to simulate optimistic locking. This project was used to enhance some asynchronous logic in the current microservices. 


## Getting Started

OptLock: Start by cloning this project onto your local machine using either Eclipse or a terminal. Once downloaded, use Maven to build the project, and simply run as a Spring Boot Application.


## Usage

Once the application is up and running, head to "localhost:8080/" and create as many threads as you like. Then in each thread change the information on the table. Once you press save the program will delay for 5 seconds so that you have time to change the same row on other threads and simulate the lock.
