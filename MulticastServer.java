package multicast;

import java.io.IOException;

public class MulticastServer {

	public static void main(String[] args) throws java.io.IOException {
		new MulticastServerThread().start();

	}

}
