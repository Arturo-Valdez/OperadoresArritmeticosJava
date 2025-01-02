public class PrecedenciaOperadores {
    public static void main(String[] args) {
        /*
         PRECEDENCIA DE OPERADORES EN JAVA
         1. Parentesis y Corchetes (), []
         2. Operadores Unarios -, ++, --
         3. Operadores Aritmeticos *, /, %
         4. Operadores aritmeticos +, -
         5. Relacionales <,<=, >, >=
         6. Equivalencia ==, !=
         7. Logicos &&, ||
         8. Asigancion =, +=, -=, *=, etc
         */
        
        //Expresion
        var a = (-(12 / 3) + (2 * 3)) - 1;
        System.out.println("a = " + a);
    }
}
