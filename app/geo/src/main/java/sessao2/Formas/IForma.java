package sessao2.Formas;

import java.math.BigDecimal;

/**
 * A interface IForma tem como objetivo padronizar o comportamento comum
 * das forma geométricas. Para isso são formalizados os métodos:
 * <ul>
 * <li>perímetro (retorna valor double)</li>
 * <li>área (retorna valor double) </li>
 * </ul>
 * que todas as formas devem implementar
 * <p>
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 *
 */
public interface IForma {
    /**
    * <p>Método que cálcula o valor do perímetro do retangulo
    * @since 1.0
    * @return double - valor do perímetro da forma
    */
    public BigDecimal perimetro();
    /**
    * <p>Método que cálcula o valor sa área do retangulo
    * @since 1.0
    * @return double - valor da área da forma
    */
    public BigDecimal area();

    /**
    * Método que devolve o nome da forma que representa
    * @since 2.0
    * @return String - Nome da Forma Geométrica
    */
    public String nomeDaForma();
}