public class Operaciones {

    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
    }
    public void sumar(double op1, double op2){
        double resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
    }
    public void sumar(int op1, double op2){
        double resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
    }
    public void sumar(double op1, int op2){
        double resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
    }

    // VOID -> el retorno, lo que devuelve, es decir, lo que me va a devolver el metodo despues de haber ejecutado cosas
    public int multiplicacion(int op1, int op2){
        int resultado = op1*op2;
        System.out.println(resultado);
        // al final del metodo -> en la ultima linea tengo que decir que retona
        return resultado;
    }

    public boolean validarNumero(int numero){
        return numero>10;
    }
}
