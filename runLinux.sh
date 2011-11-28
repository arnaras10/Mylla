#!/bin/bash
mvn clean
mvn package
mvn install
echo Do you wish to run the TicTacToe game at this point? y/n 
read ANSWER
if [ $ANSWER == y ]
then
    cd ~/.m2/repository/is/marshmallow/Mylla/1.3-SNAPSHOT
    java -jar Mylla-1.3-SNAPSHOT.jar
fi
echo Thank you for installing TicTacToe