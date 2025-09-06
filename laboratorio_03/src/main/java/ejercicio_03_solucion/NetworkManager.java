package ejercicio_03_solucion;

public class NetworkManager {
    private GameConfig config;

    public NetworkManager() {
        this.config = GameConfig.getInstance(); //  Otra instancia diferente
        config.setDebugMode(true); // Configuración diferente
    }

    public void connect() {
        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
