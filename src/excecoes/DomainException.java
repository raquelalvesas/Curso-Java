package excecoes;

public class DomainException extends RuntimeException {

    public static void main(String[] args) {
    }

    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}