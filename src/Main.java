public class Main {
    public static void main (String[] args) throws Exception {

        Acquario acquario = null;
        try {
            acquario = new Acquario(3,100);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        acquario.addPesce("Rosso", 2);
        acquario.addPesce("Spada", 10);
        acquario.addPesce("Pulitore", 4);

        System.out.println(acquario.toString());

    }

}
