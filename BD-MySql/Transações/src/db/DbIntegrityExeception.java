package db;

public class DbIntegrityExeception extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityExeception(String msg) {
		super(msg);
	}
}
