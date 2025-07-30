Java Multicast Stock Ticker
A Java-based multicast stock ticker application developed following Dr. Daehee Kim's tutorial. The server reads stock names from a text file and multicasts them to a group, while clients join the group to receive and display the updates in the console.

Credits
This project was built based on the tutorial by Dr. Daehee Kim, whose guidance provided the foundation for the multicast server-client architecture.

Features
Server multicasts stock names every 2 seconds to 230.0.0.111:1111.
Client joins the multicast group and displays stock updates.
Reads stock data from stocks.txt (e.g., "1 Wal-Mart Stores").
Console-based output (no GUI).

Requirements
Java 8 or later (JDK installed).
A terminal or IDE (e.g., IntelliJ, Eclipse) to compile and run.
stocks.txt file in the project root with stock names (one per line).

Project Structure
JavaMulticastStock/
├── src/
│   └── multicast/
│       ├── MulticastClient.java
│       ├── MulticastServer.java
│       ├── MulticastServerThread.java
├── stocks.txt
├── README.mSetup Instructions

Clone the repository:
git clone https://github.com/JustisDutt/Multicast-Stock-Ticker-Java.git

Navigate to the project directory:
cd JavaMulticastStock

Compile the Java files:
javac src/multicast/*.java

Run the server (in one terminal):
java src.multicast.MulticastServer

Run the client (in another terminal):
java src.multicast.MulticastClient


Usage
Ensure stocks.txt is in the project root with stock names.
Start the server to multicast stock data.
Run one or more clients to receive and display stock names.
The client stops after receiving 100 updates or when the server sends "No more stocks. Goodbye."

Notes
Ensure network settings allow multicast traffic on 230.0.0.111:1111.
If stocks.txt is missing, the server will print an error and stop.
Edit stocks.txt to customize stock data.

License
This project is licensed under the MIT Licensed
