package exceptions;

public class ExcecaoDeNegocios extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcecaoDeNegocios(String msg) {
		super(msg);
	}
}