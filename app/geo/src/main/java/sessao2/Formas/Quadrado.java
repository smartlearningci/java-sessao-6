package sessao2.Formas;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A classe Quadrado tem como objetivo criar uma representação
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
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 */
public class Quadrado extends Forma implements IForma {



    /**
    * <p>Construtor que recebe por parâmetros as coordenadas dos vértices do
    * quadrado
    * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
    * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
    * @since 1.0
    */
    public Quadrado(ArrayList coordenadaX, ArrayList coordenadaY){
        super( coordenadaX, coordenadaY, "Quadrado");
        //coordenadaX[1] = 10;
    }


    @Override
    public String toString() {
        return "Quadrado";
    }


    /**
    * <p>Método que cálcula o valor do perímetro do quadrado
    * @since 1.0
    * @return int - valor do perímetro do quadrado
    */
    public BigDecimal perimetro(){

        BigDecimal perimetro = new BigDecimal(0);
        perimetro = ((BigDecimal)this.getCoordenadaX().get(1)).add((BigDecimal)this.getCoordenadaY().get(2)).multiply(new BigDecimal(2));
        return perimetro;
    }

    /**
    * <p>Método que cálcula o valor da área do quadrado
    * @since 1.0
    * @return int - valor da área do quadrado
    */
    public BigDecimal area(){

        BigDecimal area  = ((BigDecimal)this.getCoordenadaX().get(1)).multiply((BigDecimal)this.getCoordenadaY().get(2));
        return area;

    }



}