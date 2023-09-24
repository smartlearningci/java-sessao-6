package sessao2.Formas;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A classe Triangulo tem como objetivo criar uma representação
 * desta forma geométrica.
 * A classe extende a classe Forma que já define as coordenadas
 * dos pontos da forma.
 *
 * Associdado à representação dos vértices a classe possibilita
 * o cálculo de:
 * <ul>
 * <li>perímetro</li>
 * <li>área</li>
 * </ul>
 * através de dois métodos públicos com o mesmo nome.
 * <p>
 * A classe implementa o método toString para descrição do objeto.
 *
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 */
public class Triangulo extends Forma implements IForma {

    /**
     * <p>
     * Construtor que recebe por parâmetros as coordenadas dos vértices do
     * quadrado
     *
     * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
     * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
     * @since 1.0
     */
    public Triangulo(ArrayList coordenadaX, ArrayList coordenadaY) {
        super(coordenadaX, coordenadaY, "Triangulo");
    }

    @Override
    public String toString() {
        return "Triangulo ";
    }

    /**
     * <p>
     * Método que cálcula o valor do perímetro do retangulo
     *
     * @since 1.0
     * @return int - valor do perímetro do retângulo
     */
    public BigDecimal perimetro() {
        BigDecimal perimetro = new BigDecimal(0);
        perimetro = ((BigDecimal)this.getCoordenadaX().get(1)).add((BigDecimal)this.getCoordenadaY().get(2)).multiply(new BigDecimal(2));
        return perimetro;
    }

    /**
     * <p>
     * Método que cálcula o valor sa área do retangulo
     *
     * @since 1.0
     * @return int - valor da área do retângulo
     */
    public BigDecimal area() {
        BigDecimal area  = ((BigDecimal)this.getCoordenadaX().get(1)).multiply((BigDecimal)this.getCoordenadaY().get(2));
        return area;

    }

}