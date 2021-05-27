package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finJuego = false;  
        Integer rondasJugadas = 0;    // NÃºmero de rondas jugadas
        Integer exitosJugador1 = p1.exitos;
        Integer exitosJugador2 = p2.exitos;
        Integer empates = 0;
        String opcion_JUGADOR1, opcion_JUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcion_JUGADOR1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_JUGADOR1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcion_JUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_JUGADOR2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.exitos;
                
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_JUGADOR1 == opcion_JUGADOR2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.exitos >= 3)||(p2.exitos >= 3))
            {
            	finJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finJuego != true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion = "";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
        }
        return opcion;
    }
    public void setExitos() 
    {
    	exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }
    
    int exitos;      // nÃºmero de partidas ganadas
}
