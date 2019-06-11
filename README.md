# kafka
# A demonstration of spring boot + kafka integration

Before running producer and consumer application, we need to download kafka and run zookeper, kafka server.

Go to this page, https://kafka.apache.org/downloads and download the latest stable release (2.2.1 was the stable release when I wrote this article).

After downloading, Extract the file and open the folder and create a data folder inside it. Inside the data folder create two more subfolders named Kafka and zookeeper. These two folders are for storing the logs generated while we start Kafka and zookeeper. Kafka uses zookeeper to manage the clusters. ZooKeeper is used to coordinate the brokers/cluster topology.

After creating these folders, we need to point these locations in server and zookeeper property file. Open the config folder and open zookeeper.properties, here point the location of zookeeper folder that we created early to the dataDir field. Similarly, inside the server.properties file, point the location of Kafka folder which we have created early to the log.dirs field.

Now we are ready to start the zookeeper and Kafka server. In this example, Kafka will use the local machine as the server.

Open the command prompt and change the location to the extracted folder.

bin\windows\zookeeper-server-start.bat config\zookeeper.properties

bin\windows\kafka-server-start.bat config\server.properties

Use these commands to start zookeeper and Kafka server.
