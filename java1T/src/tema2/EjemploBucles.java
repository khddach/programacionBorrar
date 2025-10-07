package tema2;

import java.util.Scanner;

public class EjemploBucles {
  public static void main(String[] args) {

      //1. Suma los 10 primeros numeros (0,1,...,9) y muestra el resultado

      //2. Pide 5 numeros por telcado y di si es par o impar

      //3 Pide por telcado cuatro notas(double) y muestra la media de ellas

      //1. Suma los 10 primeros numeros (0,1,...,9) y muestra el resultado
      int contador = 1;
      int resultado = 0;

      while(contador <=10){

          resultado += contador;

          contador++;
      }

      System.out.println("Suma total es : " + resultado);


      //2. Pide 5 numeros por telcado y di si es par o impar

      Scanner sc = new Scanner(System.in);

      contador = 1;
      int numero = 0;
      while(contador <=5){

          System.out.print("Dime la numero: ");
          numero = sc.nextInt();

          if (numero % 2 == 0){
              System.out.println(numero + " es par");
          } else {
              System.out.println(numero + " es impar");
          }

          contador++;
      }

      //3 Pide por telcado cuatro notas(double) y muestra la media de ellas
      contador = 1;
      double notas = 0.0,media = 0.0;
      while(contador <=4){

          System.out.print("Dime la nota"+contador+": ");
          notas += sc.nextDouble();
          contador++;
      }

      media = notas / contador ;

      System.out.println("La nota media es: " + media);
  }
}
