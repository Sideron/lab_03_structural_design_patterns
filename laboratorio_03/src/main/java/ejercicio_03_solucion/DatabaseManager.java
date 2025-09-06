package ejercicio_03_solucion;

public class DatabaseManager {

    private GameConfig config;

    public DatabaseManager() {
        this.config = GameConfig.getInstance(); //  Tercera instancia
        config.setDatabaseUrl("jdbc:mysql://production:3306/gamedb"); // Configuración diferente
    }

    public void saveData() {
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
