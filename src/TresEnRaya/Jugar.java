
package TresEnRaya;
//El juego hará lo siguinete para lo que creará los métodos convenientes
//Creará un clase tablero que estara formado por una matrix de 2x2 y el turno que inicia
//cada celda de la matriz valdrá O,X o vacío. el jugador 1 rellenarán con 0 y el jugador 2 con X
//en cada tirada se comprobará si existe alguna fila, o columna o la diagonal con el mismo contenido
//en caso afirmativo se acabará el juego y se proclamará al vencedor. Si no hya vencedor se comprobará si el tablero
//ya está lleno por que también se acabaría el juego sin declarar vencedor "tablas"
//se creará un menú para indicar si se quiere seguir jugando o desea parar
//cada vez que un jugador juegue, se mostrará el estado del tablero


import javax.management.ObjectInstance;

public class Jugar {


    public static void main(String[] args) {
        Tablero tablero=new Tablero();;
        boolean jugar=pedirOpcion();
        boolean hayGanador=false, tableroLleno=false;
        tablero.mostrar();

        while (jugar){
        while (!tableroLleno && !hayGanador ){

            tablero.avisaAJugador(tablero.isJugador());
            tablero.mueveJugador (tablero.isJugador());

            hayGanador=tablero.comprobarSiGanador();
            if (!hayGanador) {
                tableroLleno = tablero.comprobarSiLleno();
            }
        }
        jugar=pedirOpcion();
    }
}

    private static boolean pedirOpcion() {
    }