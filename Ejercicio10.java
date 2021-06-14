package Clase2;

import java.util.Scanner;

public class Ejercicio10 {
    //Pedir el ingreso de 4 numeros y retornar su suma en valor absoluto.

    public static  void main (String arg []){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese un numero");
        int num2 = input.nextInt();

        System.out.println("Ingrese un numero");
        int num3 = input.nextInt();

        System.out.println("Ingrese un numero");
        int num4 = input.nextInt();

        int suma = num1 + num2 + num3 + num4;

        if (suma < 0){

            suma = suma * (-1);
            System.out.println("valor" + suma);
        }
        else
        {System.out.println("VALOR" + suma);}

    }


}
