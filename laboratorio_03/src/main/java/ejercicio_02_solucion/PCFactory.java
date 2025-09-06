package ejercicio_02_solucion;

public class PCFactory extends GameElementFactory{
    @Override
    public Character createCharacter() {
        return new PCWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
}
