package math.ves.api;

import java.util.Random;

public class NumericExpression {
    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int numero5;
    private float numero6;
    private float numero7;

    public int gerarExpressao() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(30) + 1;
        int expressao;
        while (true) {
            try {
                switch (numeroAleatorio) {
                    case 1:
                        expressao = numero1 + numero2 * (numero3 / numero4)
                                + (int) Math.pow(numero6, numero7);
                        return expressao;

                    case 2:
                        expressao = numero1 / numero2 + (numero3 / numero4)
                                + (int) Math.pow(numero6, numero7) * numero5;
                        return expressao;

                    case 3:
                        expressao = (int) Math.pow(numero6, numero7) -
                                numero1 / numero2 + (numero3 / numero4)
                                + numero5;
                        return expressao;
                }
            } catch (Exception e) {
                return 0;
            }
        }
    }

    private int gerarNumeroBaseInteiro() {
        Random random = new Random();
        int numero;
        numero = random.nextInt(30) + 1;
        return numero;
    }

    private float gerarNumeroBaseFlutuante() {
        Random random = new Random();
        float numero;
        numero = random.nextFloat(20) + 1;
        return numero;
    }
}
