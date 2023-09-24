package sessao2.Formas.Excecoes;

public class PerimetroException extends ArithmeticException {
	
	
	public PerimetroException(double divisor)
    {
        super("O erro foi devido ao divisor ser igual a: " + divisor);
    }
    public PerimetroException(String msgErro)
    {
        super(msgErro);
    }
	
}
