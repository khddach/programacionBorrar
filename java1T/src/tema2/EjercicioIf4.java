package tema2;

public class EjercicioIf4 {
    public static void main(String[] args) {
        /**
         * DESCUENTOS EN TIENDA DE VIDEOJUEGOS
         * Descuento base según el tipo de cliente:
         *   - "estudiante" -> 15%
         *   - "premium" -> 25%
         *   - "infantil" -> 10%
         *
         * Descuento adicional:
         *   - 15% extra si es tu cumpleaños
         *   - 10% extra si compras más de tres juegos
         *   - 5% extra si es fin de semana
         *
         * El descuento total acumulado no puede superar el 40%
         * Si el precio final es inferior a 10€ pagarás un mínimo de 10€
         *
         * V.Entrada: totalPedido, tipoCliente, esCumple, esFinDe, numJuegosPedido
         * V.Salida: descuento aplicado y total del pedido menos el descuento
         */


        double totalPedido = 120.0;
        boolean esCumple = false, esFinDe = true;
        int numJuegosPedido = 2;
        String tipoCliente = "estudiante";

        double descuentoAplicado = 0.0, totalPedidoDescuento = 0.0;

        switch (tipoCliente){
            case "estudiante":
                descuentoAplicado = 0.15;
                break;
            case "premium":
                descuentoAplicado = 0.25;
                break;
            case "infantil":
                descuentoAplicado = 0.10;
                break;
            default:
        }

        //DESCUENTO EXTRA
        if (esCumple) {
            descuentoAplicado += 0.15;
        }
        if (numJuegosPedido > 3) {
            descuentoAplicado += 0.10;
        }
        if (esFinDe) {
            descuentoAplicado += 0.05;
        }

        //El descuentoAplicado no puede superar el 40%
        if (descuentoAplicado > 0.40) {
            System.out.println("Descuento demasiado alto, se aplica el 40%");
            descuentoAplicado = 0.40;
        }

        totalPedidoDescuento = totalPedido - ( totalPedido * descuentoAplicado );


        //SI el precio es menor que 10euros, le subimos a 10euros
        if (totalPedidoDescuento < 10){
            System.out.println("Precio demasiado bajo con descuentos, se aplica mínimo" +
                    " de 10€");
            totalPedidoDescuento = 10;
        }


        System.out.println("El precio final del pedido es de " + totalPedidoDescuento + "euros");
        System.out.println("El descuento aplicado es de "+ (descuentoAplicado*100) + "%");

    }
}
