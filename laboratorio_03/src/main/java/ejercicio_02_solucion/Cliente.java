package ejercicio_02_solucion;

public class Cliente {
    public static void main(String[] args) {
        // TODO code application logic here
        GameElementFactory creatorPC = new PCFactory();
        GameElementFactory creatorMobile = new MobileFactory();

        // ❌ PROBLEMA: Nada garantiza que sean compatibles ** Corregido!!!
        Character pcWarrior = creatorPC.createCharacter();
        Weapon mobileSwold = creatorMobile.createWeapon();

        pcWarrior.attack();
        mobileSwold.use();
    }
}
