package timer;

public class Main {
    public static void main(String[] args) {
        Timer test = new Timer();
        //parte il timer
        test.start();
        //metodo da testare
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j = j + i;


        }
        //finisce lo start
        test.end();
        System.out.println("la durata del metodo è " + test.elapsedTime() + " nanosecondi");

    }


}


