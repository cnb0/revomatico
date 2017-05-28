package ro.dcsi.internship;

import org.junit.Test;

public class UserStorageTest {
	UserStorage storage = new UserStorage("src/test/resources/users.csv","target/output-UsersStorageTest.csv");
	
	@Test
	public void importFile() {
		storage.importUsers();
	}
	
	@Test
	public void exportFile() {
		storage.exportUsers();
	}

}
