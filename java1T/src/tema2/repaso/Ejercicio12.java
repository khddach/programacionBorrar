package tema2.repaso;

public class Ejercicio12
{
    public static void main(String[] args) {

        /*// Cuadrado
        areaCuadrado = L * L
        perimetroCuadrado = 4 * L

// Rectángulo
        areaRectangulo = B * L
        perimetroRectangulo = 2 * (B + L)

// Triángulo
        areaTriangulo = (B * h) / 2
        perimetroTriangulo = L1 + L2 + L3

// Rombo
        areaRombo = (D * d) / 2
        perimetroRombo = 4 * L

// Pentágono
        areaPentagono = (perimetro * apotema) / 2
        perimetroPentagono = 5 * L

// Hexágono
        areaHexagono = (perimetro * apotema) / 2
        perimetroHexagono = 6 * L
//
// Círculo
        areaCirculo = π * r²
        perimetroCirculo = 2 * π * r

// Trapecio
        areaTrapecio = ((B + b) * h) / 2
        perimetroTrapecio = B + b + L1 + L2

// Paralelogramo
        areaParalelogramo = B * h
        perimetroParalelogramo = 2 * (B + L)

        volumen = Math.PI * Math.pow(radio,2) * altura;
        area = 2 * Math.PI * (radio + altura);


        int capicua = 0;
        int num = telcadoNum ;
        while (num > 0) {
            int digito = num % 10;
            capicua = capicua * 10 + digito;
            num = num / 10;
        }

        horas = t / 3600;
        minutos = (t % 3600 ) / 60;
        segundos = t % 60;


        int billete200 = cantidad / 200;



        resto = cantidad % 200;
        int billete100 = resto / 100;
        (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
        int num = numString.charAt(i)- '0';*/


        for (int i = 0; i < 4; i++) {

            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
