// Singleton.java
public class Singleton {
    // Campo estático que contiene la única instancia de la clase Singleton.
    private static Singleton uniqueInstance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase.
    private Singleton() {
        // Inicialización de recursos, si es necesario.
    }

    // Método estático que retorna la única instancia de la clase.
    public static Singleton getInstance() {
        // Si la instancia única no ha sido creada aún, la crea.
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        // Retorna la instancia única.
        return uniqueInstance;
    }

    // Métodos de la clase Singleton.
    public void showMessage() {
        System.out.println("Singleton");
    }
}
