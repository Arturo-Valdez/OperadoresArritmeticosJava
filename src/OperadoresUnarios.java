public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, resultado;
        var c = true;

        //Operador unario +
        resultado = +a;
        System.out.println("Resultado +a = " + resultado);

        //Operador unario -
        resultado = -a;
        System.out.println("Resultado -a = " + resultado);

        //Operadores unarios incremento / decremento

        //Pre-incremento
        resultado = ++a;
        System.out.println("Resultado ++a = " + resultado);

        //Post-incremento
        a = 3;
        resultado = a++;
        System.out.println("Resultado a++ = " + resultado);
        System.out.println("Al llamar 'a' se ingrementa = " + a);

        //Pre-decremento
        resultado = --a;
        System.out.println("Resultado --a = " + resultado);

        //Post-decremento
        a = 3;
        resultado = a--;
        System.out.println("Resultado a-- = " + resultado);
        System.out.println("Al llamar 'a' decrementa a-- = " + a);

    }
}
