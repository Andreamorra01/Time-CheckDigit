package timer;

public class Timer {
    /**
     * attributi classe
     */
    private long start;
    private long fine;

    //costruttore di default
    Timer(){

    }
/** parte il timer, nanoTime restituirsce l'ora corrente in nanosecondi   **/

    public void start(){
        start = System.nanoTime();

        /**termina il timer **/
    }
    public void end(){
        fine = System.nanoTime();

    }

    /**
     * resetta il timer
     * @return valore a partire da 0
     */
    public void reset(){
        start = System.nanoTime();
        fine = 0;

        /**
         * calcola il tempo trascorso sottraendo dalla fine all'inizio del timer
         */
    }
    public long elapsedTime(){
        return this.fine - this.start;
    }


}