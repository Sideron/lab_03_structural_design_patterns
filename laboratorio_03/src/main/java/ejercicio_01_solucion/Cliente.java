/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_solucion;

/**
 *
 * @author o12307
 */
public class Cliente {
    public static void main(String[] args) {
        // TODO code application logic here
        GameFactory creatorRPG = new RPGFactory();
        GameFactory creatorFPS = new FPSFactory();

        Game rpg = creatorRPG.createGame();
        rpg.start();

        Game fps = creatorFPS.createGame();
        fps.start();
    }
}
