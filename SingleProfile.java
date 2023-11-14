public class Test {
	public static void main(String[] args) {
		System.out.println("Hello world !");
		// SingleDBConnection connection = new SingleDBConnection();

		SingleDBConnection connection = SingleDBConnection.getInstance();
	}
}

public class SingleDBConnection {

	private static SingleDBConnection connection = new SingleDBConnection();

	private boolean connected = false;

	private void connectionSQL() {
		this.connected = true;
		System.out.println("Connection successfull !");
	}

	private SingleDBConnection() {
		this.connectionSQL();
	}

	public static SingleDBConnection getInstance() {
		return connection;
	}

}


