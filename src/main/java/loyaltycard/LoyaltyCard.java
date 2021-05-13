package loyaltycard;

public class LoyaltyCard {

    private String codice;

    /** costruttore vuoto**/
    public LoyaltyCard() {
    }

    /**
     * costruttore con parametro
     * @param codice
     */
    public LoyaltyCard(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
    /**
     * @param code
     * @return solo l'ultima cifra,ovvero checkDigit
     */
    public int checkDigit(){
        int size = this.codice.length();
        int[] arrInt = new int[size];
        for (int i = 0; i < size; i++) {
            arrInt[i] = Integer.parseInt(String.valueOf(this.codice.charAt(i)));
        }
        int nDispari = 0;
        int nPari = 0;
        int multiplePari = 0;

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                nDispari = nDispari + arrInt[i];
            }
            if (i % 2 == 1) {
                nPari = nPari + arrInt[i];
            }
        }
        multiplePari = nPari * 3;
        int lastCifre = Math.abs(multiplePari+nDispari) % 10;
        if(lastCifre != 0){
            lastCifre = 10-lastCifre;
        }
        return lastCifre;
    }

    /**
     * metodo che verifità la validità della carta
     * @param code
     * @returnritorna true se il numero di carta è a 13 cifre e la 13.ma è corretta, false altrimenti.
     */
    public boolean checkValidity() {
        int size = this.codice.length();
        if (size != 13) {
            return false;
        }else{
            int[] arrInt = new int[size];
            for (int i = 0; i < size; i++) {
                arrInt[i] = Integer.parseInt(String.valueOf(this.codice.charAt(i)));
            }
            int lastCifre = checkDigit();
            if(arrInt[12] == lastCifre) {
                return true;
            }
        }
        return false;
    }



    /**
     * @param code
     * @return il codice a 12 cifre, escluso il numero di check finale
     */
    public CharSequence getCardNo(){
        if(this.codice.length() == 13){
            return this.codice.substring(0, this.codice.length() - 1);
        }else if(this.codice.length() == 12){
            return this.codice;
        }
        return null;
    }

    /**
     * calcola il check digit e ritorna il codice completo
     * @param code
     * @return il numero di carta a 13 cifre.
     */

    public String getFullCardNo(){
        if(this.codice.length() == 12){
            return this.codice+ checkDigit();
        }else if(this.codice.length() == 13){
            return this.codice;
        }
        return null;
    }



}