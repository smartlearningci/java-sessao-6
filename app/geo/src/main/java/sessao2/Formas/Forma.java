package sessao2.Formas;

import java.util.ArrayList;

/**
 * A classe Forma tem como objetivo criar uma representação
 * base comum das formas geométricas.
 * Relativamente às versões anteriores os pontos são representados em forma de
 * coordenadas X e Y em tipo double e não int (como na versão 1)
 * 
 * Adicionalmente os pontos são armazenados numa estrutura array double[]
 * para mais rápida manipulação
 * <ul>
 * <li>ArrayList coordenadaX</li>
 * <li>ArrayList coordenadaX</li>
 * </ul>
 *
 * É criada também uma variável interna, numeroDePonts, que permite saber quantos
 * vértices tem uma determinada forma.
 * O cálculo do perimetro e área depende da forma e por isso não é implementada
 * nesta classe
 * 
 * @author Eduardo Catarino
 * @version 1.0
 * @since 2.0
 */
public class Forma {


    private ArrayList coordenadaX;
    private ArrayList coordenadaY;
    private int numeroDePontos;
    protected static final double PI = 3.14;
    private String nomeDaForma = "";



    /**
    * Construtor que recebe por parâmetros as coordenadas dos vértices do
    * quadrado
    * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
    * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
    * @since 2.0
    */
    public Forma(ArrayList coordenadaX, ArrayList coordenadaY, String nome) {
    	
        this.coordenadaX = new ArrayList();
        this.coordenadaX.addAll(coordenadaX);
        this.coordenadaY = new ArrayList(); 
        this.coordenadaY.addAll(coordenadaY);
        this.numeroDePontos = coordenadaX.size();
        this.nomeDaForma = nome;
    }

    //Getters e setters que permitem obter/modificar o conteudo dos campos
    public ArrayList getCoordenadaX() {
        return coordenadaX;
    }


    public ArrayList getCoordenadaY() {
        return coordenadaY;
    }

    /**
    * Método que devolve o número de pontos associados à forma geométrica
    */
    public int getNumeroDePontos() {
        return numeroDePontos;
    }

    /**
    * Método que devolve o nome da forma que representa
    * @since 2.0
    * @return String - Nome da Forma Geométrica
    */
    public String nomeDaForma()
    {
        return  nomeDaForma.toUpperCase();
    }

    


}