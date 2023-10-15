public class Acquario {

    private Pesce pesci[];
    private double volume;

    public Acquario(int dim, double volume) throws Exception{
        if(dim <= 0){
            throw new Exception("Valore non valido");
        }

        this.pesci = new Pesce[dim];

        if(volume <= 0){
            throw new Exception("Valore non valido");
        }

        this.volume = volume;
    }

    public Acquario(Pesce[] pesci, double volume) throws Exception{
        if(pesci.length == 0){
            throw new Exception("Dimensione non valida");
        }

        this.pesci = new Pesce[pesci.length];

        for(int i = 0; i < this.pesci.length; i++){
            this.pesci[i] = pesci[i].clone();
        }

        if(volume <= 0){
            throw new Exception("Valore non valido");
        }

        this.volume = volume;
    }

    public Pesce getPesce(int pos){
        return pos < this.pesci.length && pos >= 0 && this.pesci[pos] != null?this.pesci[pos]:null;
    }

    public double getVolume(){
        return this.volume;
    }

    public boolean addPesce(String tipo, double volume) throws Exception {
        boolean rit = false;

        int i = 0;
        while(i < this.pesci.length && this.pesci[i] != null){
            i++;
        }

        if(i < this.pesci.length){
            this.pesci[i] = new Pesce(tipo, volume);
            rit = true;
        }

        return rit;
    }

    public boolean deletePesce(int pos){
        boolean rit = false;

        if(pos < this.pesci.length && pos >= 0 && this.pesci[pos] != null){
            this.pesci[pos] = null;
            rit = true;
        }

        return rit;
    }

    public boolean editPesce(int pos, String tipo, double peso) throws Exception {
        boolean rit = false;

        if(pos < this.pesci.length && pos >= 0 && this.pesci[pos] != null){
            this.pesci[pos] = new Pesce(tipo, peso);
            rit = true;
        }

        return rit;
    }

    public Acquario clone(){
        try {
            return new Acquario(this.pesci, this.volume);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String toString(){
        String rit = "{Pesci: \n";

        for(int i = 0; i < this.pesci.length; i++){
            rit += "Pesce " + (i+1) + "\n";
            rit += this.pesci[i].toString();
        }

        rit += "Volume: " + this.volume + "}";

        return rit;
    }
}
