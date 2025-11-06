import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado; //null, no es recomendable darle valores aquí arriba

    /* Enunciado Ejercicio 1:
Hágase una aplicación que permita introducir el número de bebidas y bocadillos
comprados (valores entre 0 y 20. Además se podrá introducir el precio de cada
bebida (valor entre 0.00 € y 3.00 € y de cada bocadillo (valor entre 0.00 € y 5.00
€. También se podrá introducir el número de alumnos que realizaron la compra
(valor entre 0 y 10. Se mostrará el total de la compra (con el subtotal de las
bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
redondeada a 2 decimales. CosteBar)
        */

    /* Enunciado Ejercicio 2:
Permítase introducir el valor con IVA de una compra con dos decimales (la
compra no puede ser superior a 500€ ni inferior a 0€ y el valor del IVA de dicha
compra (valor entero entre 0 y 25%.¿Cuánto costó la compra sin IVA?¿Cuánto fue
el IVA? Muéstrese los resultados redondeados a dos decimales. Compra)
        */

    /* Enunciado Ejercicio 3:
Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
centenas, decenas y unidades), y se obtiene el número correspondiente.
Numero)
        */

    /* Enunciado Ejercicio 4:
Hágase un programa que convierta segundos en horas, minutos y segundos.Segundos)
        */



    public void ejercicio1(){
        lectorTeclado = new Scanner(System.in); // el scanner es buena práctica dejarlo cerrado

        // 1- Pedir cosas por teclado:
        // 2- Guardar cosas en variables
        System.out.println("¿Cuántas bebidas vas a comprar? ");
        int bebidas = lectorTeclado.nextInt(); // así se pide el número de bebidas

        System.out.println("¿Cuántos bocadillos vas a comprar? ");
        int bocatas = lectorTeclado.nextInt(); // así se pide el número de bocatas

        System.out.println("¿Cuánto vale cada bebida? ");
        double precioBebida = lectorTeclado.nextDouble();

        System.out.println("¿Cuánto vale cada bocata? ");
        double precioBocata = lectorTeclado.nextDouble();

        System.out.println("¿Cuántas personas han realizado la compra? ");
        int clientesAlumnos = lectorTeclado.nextInt();

        // 3- Realizar cálculos
        double costeBebidas = bebidas*precioBebida;
        double costeBocatas = bocatas *precioBocata;
        double costeTotal = costeBebidas+costeBocatas;
        double precioPersona = costeTotal/clientesAlumnos; //precio por persona

        // 4- Mostrar información
        System.out.println("El precio total de la compra es: "+costeTotal);
        System.out.println("El precio total de los bocatas es: "+costeBocatas);
        System.out.println("El precio total de los bebidas es: "+costeBebidas);
        System.out.println("El precio a pagar por persona es: "+precioPersona);

        lectorTeclado.close(); // así se cierra
    }

    public void ejercicio2(){
        lectorTeclado = new Scanner(System.in); // el scanner es buena práctica dejarlo cerrado

        System.out.println("¿Cuál es el valor de la compra con IVA? ");
        double compraConIva = lectorTeclado.nextDouble();

        //System.out.println("¿La compra con IVA es superior a 500 o inferior a 0? ");
        //boolean resultadoCondicion = compraConIva>=0 && compraConIva<=500;

        System.out.println("¿Cuánto es el porcentaje de IVA? ");
        double porcentajeIva = lectorTeclado.nextDouble();

        System.out.println("¿Cuánto costó la compra sin IVA? ");
        double compraSinIva = (compraConIva/((porcentajeIva/100)+1));
        System.out.printf("La compra sin Iva es de: %.2f\n",compraSinIva);

        System.out.println("¿Cuánto es el IVA en euros?");
        double resultadoIva = compraConIva-compraSinIva;
        System.out.printf("El IVA en euros es de: %.2f\n",resultadoIva);

        // System.out.printf("El precio total de la compra es: %.2f\n");

        lectorTeclado.close(); // así se cierra
    }

    public void ejercicio3(){
        lectorTeclado = new Scanner(System.in); // el scanner es buena práctica dejarlo cerrado

                    // Decenas de mil --> 10000
                    // Unidades de mil --> 1000
                    // Centenas --> 100
                    // Decenas --> 10
                    // Unidades --> 1

        System.out.println("¿Cuántas decenas de mil quieres? ");
        int op1 = lectorTeclado.nextInt();
        int decenasMil = op1*10000;

        System.out.println("¿Cuántas unidades de mil quieres? ");
        int op2 = lectorTeclado.nextInt();
        int unidadesMil = op2*1000;

        System.out.println("¿Cuántas centenas quieres? ");
        int op3 = lectorTeclado.nextInt();
        int centenas = op3*100;

        System.out.println("¿Cuántas decenas quieres? ");
        int op4 = lectorTeclado.nextInt();
        int decenas = op4*10;

        System.out.println("¿Cuántas unidades quieres? ");
        int op5 = lectorTeclado.nextInt();
        int unidades = op5*1;

        System.out.println("¿Cuál es el resultado total? ");
        int total = decenasMil+unidadesMil+centenas+decenas+unidades;


        System.out.println("Decenas de mil: "+decenasMil);
        System.out.println("Unidades de mil: "+unidadesMil);
        System.out.println("Centenas: "+centenas);
        System.out.println("Decenas: "+decenas);
        System.out.println("Unidades: "+unidades);
        System.out.println("Numero introducido: "+total);

        lectorTeclado.close(); // así se cierra
    }

    public void ejercicio4(){
        lectorTeclado = new Scanner(System.in); // el scanner es buena práctica dejarlo cerrado

        // 1- Pedir datos
        System.out.println("¿Cuántos segundos quieres pasar a tiempo?");
        int valorSegundos = lectorTeclado.nextInt();

        // 2- Realizar cálculos
            // Segundos en 1 hora --> 3600"
            // Minutos en 1 hora --> 60'
            // Segundos en 1 minuto --> 60"
        int horas = valorSegundos/3600;
        int minutos = (valorSegundos%3600)/60; //% es el resto de la división
        int segundos = valorSegundos%60;

        // 3- Mostrar información
        System.out.println("El numero de horas es de: "+horas);
        System.out.println("El numero de minutos es de: "+minutos);
        System.out.println("El numero de segundos es de: "+segundos);

        lectorTeclado.close(); // así se cierra
    }
}
