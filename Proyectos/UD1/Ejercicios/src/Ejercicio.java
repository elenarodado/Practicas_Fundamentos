import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;
    /* EJERCICIO 1
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados
    (valores entre 0 y 20). Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €)
    y de cada bocadillo (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que
    realizaron la compra (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)
    */
    public void ejercicio1(){
        lectorTeclado = new Scanner(System.in);

        // 1 -> PEDIR COSAS POR TECLADO | 2 -> GUARDAR EN VARIABLE
        System.out.println("¿Cuántas bebidas vas a comprar?");
        int bebidas = lectorTeclado.nextInt();
        System.out.println("¿Cuánto vale cada bebida?");
        double precioBebida = lectorTeclado.nextDouble();

        System.out.println("¿Cuántos bocadillos vas a comprar?");
        int bocatas = lectorTeclado.nextInt();
        System.out.println("¿Cuánto vale cada bocadillo?");
        double precioBocata = lectorTeclado.nextDouble();

        System.out.println("¿Cuántas personas han realizado la compra?");
        int numeroPersonas = lectorTeclado.nextInt();

        // 3 -> REALIZAR CÁLCULOS
        double costeBocadillos = bocatas * precioBocata;
        double costeBebidas = bebidas * precioBebida;
        double costeTotal = costeBebidas + costeBocadillos;
        double precioPersona = costeTotal/numeroPersonas;

        // 4 -> MOSTRAR INFORMACIÓN
        System.out.printf("El precio total de la compra es %.2f%n",costeTotal);
        System.out.printf("El precio total de los bocatas es %.2f%n",costeBocadillos);
        System.out.printf("El precio total de las bebidas es %.2f%n",costeBebidas);
        System.out.printf("El precio total por persona es %.2f%n",precioPersona);

        lectorTeclado.close();
        return;
    }

    /* EJERCICIO 2
    Permítase introducir el valor con IVA de una compra con dos decimales
    (la compra no puede ser superior a 500€ ni inferior a 0€)
    y el valor del IVA de dicha compra (valor entero entre 0 y 25%).
    ¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA?
    Muéstrese los resultados redondeados a dos decimales. (Compra)
    */

    public void ejercicio2(){
        lectorTeclado = new Scanner(System.in);

        // 1 -> PEDIR COSAS POR TECLADO | 2 -> GUARDAR EN VARIABLE
        System.out.println("Introduce el valor de la compra con IVA");
        double compraIVA = lectorTeclado.nextDouble();

        System.out.println("Introduce el valor del IVA");
        int porcentajeIVA = lectorTeclado.nextInt();

        // 3 -> REALIZAR CÁLCULOS
        boolean condicionCompra = compraIVA<500 && compraIVA>0;
        boolean condicionIVA = porcentajeIVA>0 && porcentajeIVA<25;

        double valorIva = (double)porcentajeIVA/100 + 1;
        double compraSinIva = compraIVA / valorIva;
        double ivaEuros = compraIVA - compraSinIva;

        // 4 -> MOSTRAR INFORMACIÓN
        System.out.println("El gasto de la compra es inferior a 0 o superior a 500: "+condicionCompra);
        System.out.println("El valor del IVA es inferior a 0 o superior a 25: "+condicionIVA);
        System.out.println("El valor del IVA es: "+valorIva);

        System.out.printf("La compra sin IVA es de: %.2f%n",compraSinIva);
        System.out.printf("El Iva en euros es de: %.2f%n",ivaEuros);

        lectorTeclado.close();
        return;
    }

    /* EJERCICIO 3
    Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades),
    y se obtiene el número correspondiente. (Numero)
     */

    public void ejercicio3(){
        lectorTeclado = new Scanner (System.in);

        // 1. PEDIR DATOS
        System.out.println("Decenas de mil");
        int decenasMil = lectorTeclado.nextInt();

        System.out.println("Unidades de mil");
        int unidadesMil = lectorTeclado.nextInt();

        System.out.println("Centenas");
        int centenas = lectorTeclado.nextInt();

        System.out.println("Decenas");
        int decenas = lectorTeclado.nextInt();

        System.out.println("Unidades");
        int unidades = lectorTeclado.nextInt();

        // 2. REALIZAR CALCULOS
        // decenas de mil -> 10000
        // unidades de mil -> 1000
        // centenas -> 100
        // decenas -> 10
        // unidades -> 1
        int sumaTotal = (decenasMil*10000)+(unidadesMil*1000)+(centenas*100)+(decenas*10)+(unidades);

        // 3. MOSTRAR DATOS
        System.out.println("Numero introducido: "+sumaTotal);

        lectorTeclado.close();
        return;
    }

    /* EJERCICIO 4
    Hágase un programa que convierta segundos en horas, minutos y segundos.
    */

    public void ejercicio4(){
        lectorTeclado = new Scanner (System.in);

        // 1. PEDIR DATOS
        System.out.println("¿Cuántos segundos quieres pasar a tiempo?");
        int segundos = lectorTeclado.nextInt();

        // 2. REALIZAR CÁLCULOS
        // segundos/h -> 3600s
        // minutos/h -> 60 min
        // segundos/min -> 60s

        int resultadoHoras = segundos/3600;
        int resultadoMinutos = (segundos%3600)/60;
        int resultadoSegundos = segundos%60;

        // 3. MOSTRAR DATOS
        System.out.println("El numero de horas es "+resultadoHoras);
        System.out.println("El numero de minutos es "+resultadoMinutos);
        System.out.println("El numero de segundos es "+resultadoSegundos);

        lectorTeclado.close();
    }
}
