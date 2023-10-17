package math.ves.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("/numericexpression")
public class NumericExpression {
    @PostMapping
    public static int gerarExpressao(@RequestBody ) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(30) + 1;
        int expressao;

        int[] arrayInt = new int[10];
        double[] arrayDouble = new double[10];

        int numeroInt;
        double numeroDouble;
        for(int i = 0; i < 10; i++){
            numeroInt = random.nextInt(30) + 1;
            numeroDouble = random.nextDouble(30) + 1;
            arrayInt[i] = numeroInt;
            arrayDouble[i] = numeroDouble;
        }
        while (true) {
            try {
                switch (numeroAleatorio) {
                    case 1:
                        expressao = arrayInt[4] + arrayInt[2] * (arrayInt[7] / arrayInt[9])
                                + (int) Math.pow(arrayDouble[5], arrayDouble[8]);

                        System.out.println(arrayInt[4] + " + " + arrayInt[2] + " * (" + arrayInt[7]
                                + " / " + arrayInt[9] + ") + " + arrayDouble[5] + "^" + arrayDouble[8]);
                        return expressao;

                    case 2:
                        expressao = arrayInt[4] + arrayInt[2] * (arrayInt[7] / arrayInt[9])
                                + (int) Math.pow(arrayDouble[5], arrayDouble[8]) + arrayInt[1];
                        return expressao;

                    case 3:
                        expressao = (int) Math.pow(arrayDouble[3], arrayDouble[6]) -
                                arrayInt[1] / arrayInt[8] + (arrayInt[2] / arrayInt[5])
                                + arrayInt[9];
                        return expressao;
                }
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
