import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejecución de metodos");
        saludar("Borja");
        saludar("María");
        saludar("Juan");
        saludar("Luís");
        despedir();

        Operaciones operacionesMatematicas = new Operaciones();
        //operacionesMatematicas.sumar(4,7);
        //operacionesMatematicas.sumar(1.3,1.5); //si yo a sumar lo defino como int y otro como double la máquina lo detecta directamente
        //operacionesMatematicas.sumar(5,8.5);
        //operacionesMatematicas.sumar(9.6,7);

        int resultado2 = operacionesMatematicas.multiplicacion(5,6)*2; // gracias al return esto me sirve, me devuelve su valor y yo con ese valor puedo hacer lo que quiera

        // PARA VALIDAR UN NUMERO A TRAVÉS DE SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres validar:");
        int numeroUsuario = scanner.nextInt();
        System.out.println("¿El número es válido? "+operacionesMatematicas.validarNumero(numeroUsuario));
    }
    public static void saludar(String data){
        System.out.println("Hola "+data);
        System.out.println("Este metodo se va a repetir en el saludo");
    }
    public static void despedir() {
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos acabado");
    }
}
