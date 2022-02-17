package TresEnRaya;

public class Tablero {
    static final char CIRCULO = 'O';
    static final char CRUZ = 'X';
    static final char VACIO = '#';

    private char  [][] tablero=new char[3][3];
    private boolean jugador=true;//true es el jugador1 y false el jugador2

    public Tablero(){//el constructor limpia el tablero y da el turno al primer jugador
        limpiarTablerlo(tablero);
        jugador=true;
    }

    public boolean isJugador() {
        return jugador;
    }

    private void limpiarTablerlo(char[][] tablero) {
        for (int i=0; i< tablero.length; i++){
            for (int j=0; j< tablero[0].length;j++){
                tablero[i][j]=VACIO;
            }
        }
    }

    public void mostrar() {
    }
}
