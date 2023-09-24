package sessao2.Formas;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A classe Circulo tem como objetivo criar uma representação
 * desta forma geométrica.
 * <p>
 * A classe extende a classe Forma que já define as coordenadas
 * dos pontos da forma. Em particular vai ser só definido 1 ponto
 * que representa o centro
 * <p>
 * Adicionalmente considera-se um parâmtro extra que é o raio e que
 * as restantes formas não consideram.
 * <p>
 * Associdado à representação dos vértices a classe possibilita
 * o cálculo de:
 * <ul>
 * <li>perímetro</li>
 * <li>área</li>
 * </ul>
 * através de dois métodos públicos com o mesmo nome.
 * <p>
 * A classe implementa o método toString para descrição do objeto.
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 */
public class Circulo extends Forma implements IForma{


    private double raio;
    /**
    * <p>Construtor que recebe por parâmetros as coordenadas dos vértices do
    * quadrado
    * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
    * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
    * @since 1.0
    */
    public Circulo(ArrayList coordenadaX, ArrayList coordenadaY, double raio){
        super( coordenadaX, coordenadaY, "Circulo");
        this.raio = raio;
    }


    @Override
    public String toString() {
        return "Circulo";
    }


    /**
    * <p>Método que cálcula o valor do perímetro do quadrado
    * @since 1.0
    * @return int - valor do perímetro do quadrado
    */
    public BigDecimal perimetro(){

        BigDecimal perimetro = new BigDecimal(2*this.raio*PI);
        return perimetro;
    }

    /**
    * <p>Método que cálcula o valor da área do quadrado
    * @since 1.0
    * @return int - valor da área do quadrado
    */
    public BigDecimal area(){
        BigDecimal area = new BigDecimal(this.raio*this.raio*PI);
        return area;
    }

}

