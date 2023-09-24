package sessao2.App;

import java.math.BigDecimal;
import java.util.ArrayList;

import sessao2.Formas.Circulo;
import sessao2.Formas.IForma;
import sessao2.Formas.Quadrado;
import sessao2.Formas.Retangulo;
import sessao2.Formas.Triangulo;

/***
 * A classe App.
 * Ponto de entrada da aplicação.
 * Todos os métodos existentes para além do main são apenas para prova de algum
 * conceito
 * e/ou demonstração.
 *
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 *
 */
public class App {
    /**
     * Main - Ponto de entrada da aplicação
     */

    public static void main(String[] args) {

        char opcao = 'c'; //triangulo


        //Definição do quadrado
        ArrayList<BigDecimal> coorQuadradoX = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> coorQuadradoY = new ArrayList<BigDecimal>();
        coorQuadradoX.add(new BigDecimal(0));
        coorQuadradoY.add(new BigDecimal(0));
        coorQuadradoX.add(new BigDecimal(3));
        coorQuadradoY.add(new BigDecimal(0));
        coorQuadradoX.add(new BigDecimal(3));
        coorQuadradoY.add(new BigDecimal(3));
        coorQuadradoX.add(new BigDecimal(0));
        coorQuadradoY.add(new BigDecimal(3));
        Quadrado quadrado = new Quadrado(coorQuadradoX, coorQuadradoY);

        //Definição do Retangulo
        ArrayList coorRetanguloX = new ArrayList();
        ArrayList coorRetanguloY = new ArrayList();
        coorRetanguloX.add(new BigDecimal(0));
        coorRetanguloY.add(new BigDecimal(0));
        coorRetanguloX.add(new BigDecimal(3));
        coorRetanguloY.add(new BigDecimal(0));
        coorRetanguloX.add(new BigDecimal(3));
        coorRetanguloY.add(new BigDecimal(4));
        coorRetanguloX.add(new BigDecimal(0));
        coorRetanguloY.add(new BigDecimal(4));
        Retangulo retangulo = new Retangulo(coorRetanguloX, coorRetanguloY);


        //Definição do Triangulo
        ArrayList coorTrianguloX = new ArrayList();
        ArrayList coorTrianguloY = new ArrayList();
        coorTrianguloX.add(new BigDecimal(0));
        coorTrianguloY.add(new BigDecimal(0));
        coorTrianguloX.add(new BigDecimal(3));
        coorTrianguloY.add(new BigDecimal(0));
        coorTrianguloX.add(new BigDecimal(3));
        coorTrianguloY.add(new BigDecimal(4));

        Triangulo triangulo = new Triangulo(coorTrianguloX, coorTrianguloY);

        //Definição do Circulo
        ArrayList coorCirculoX = new ArrayList();
        ArrayList coorCirculoY = new ArrayList();
        coorCirculoX.add(new BigDecimal(0));
        coorCirculoY.add(new BigDecimal(0));
        Circulo circulo = new Circulo(coorCirculoX, coorCirculoY, 2);

        switch(opcao){
            case 'q': App.testaForma(quadrado);
                      break;
            case 'r': App.testaForma(retangulo);
                      break;
            case 't': App.testaForma(triangulo);
                      break;
            case 'c': App.testaForma(circulo);
                      break;
            default:
                System.out.println("opção errada...");
                break;
        }


    }

    /**
     * testaForma - Método estático para demonstração de polimorfismo
     * @param forma - Forma a geometrica definida por IForma
     */
    private static void testaForma(IForma forma) {

        System.out.println("----------- " + forma.nomeDaForma() + " ----------" );
        System.out.println("Perimetro da forma: " + forma.perimetro());
        System.out.println("Area da forma: " + forma.area());
    }

    /**
     * charType - Método estático para demonstração do uso do char()
     */
    private static void charType() {
        System.out.println("\nTipo char:");

        char x1 = '\u0032';
        System.out.println(x1); // imprime: 2

        char x2 = '2';
        System.out.println(x2); // imprime: 2
        x2 = 65;
        System.out.println(x2); // imprime: A

        char y1 = '\u0041';
        System.out.println(y1); // imprime: A

        char y2 = 'A';
        System.out.println(y2); // imprime: A
        y2 = 50;
        System.out.println(y2); // imprime: 2

        System.out.println(x1 + x2); // imprime: 115
        System.out.println(x1 + y1); // imprime: 115
    }

    /**
     * minMax - Método estático para demonstração dos limites de valores numéricos
     */
    private static void minMax() {
        System.out.println("\nMin e max:");

        System.out.println(Byte.MIN_VALUE); // imprime: -128
        System.out.println(Byte.MAX_VALUE); // imprime: 127
        System.out.println(Short.MIN_VALUE); // imprime: -32768
        System.out.println(Short.MAX_VALUE); // imprime: 32767
        System.out.println(Integer.MIN_VALUE); // imprime: -2147483648
        System.out.println(Integer.MAX_VALUE); // imprime: 2147483647
        System.out.println(Long.MIN_VALUE); // imprime: -9223372036854775808
        System.out.println(Long.MAX_VALUE); // imprime: 9223372036854775807
        System.out.println((int) Character.MIN_VALUE); // imprime: 0
        System.out.println((int) Character.MAX_VALUE); // imprime: 65535

        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Double.MIN_VALUE); // 4.9E-324
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
    }
}
