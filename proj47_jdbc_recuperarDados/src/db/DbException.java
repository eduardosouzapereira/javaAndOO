package db;

public class DbException extends RuntimeException {
	// Exception personalizada para caso der algum erro
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
