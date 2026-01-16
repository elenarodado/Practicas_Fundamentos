public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecución de metodos");
        saludar("Borja");
        saludar("María");
        saludar("Juan");
        saludar("Luís");
        despedir();

        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(4,7);
        operacionesMatematicas.sumar(1.3,1.5); //si yo a sumar lo defino como int y otro como double la máquina lo detecta directamente
        operacionesMatematicas.sumar(9,4);
        operacionesMatematicas.restar(5,6);
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
