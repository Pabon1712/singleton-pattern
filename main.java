// Main.java
public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la única instancia de Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Mostramos un mensaje para comprobar que ambas referencias apuntan a la misma instancia
        singleton1.showMessage();

        // Comprobamos si ambas variables apuntan a la misma instancia
        if (singleton1 == singleton2) {
            System.out.println("Ambas variables apuntan a la misma instancia.");
        } else {
            System.out.println("Las variables apuntan a instancias diferentes.");
        }
    }
}
