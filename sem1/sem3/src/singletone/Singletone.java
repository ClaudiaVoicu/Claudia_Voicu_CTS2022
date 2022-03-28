package singletone;

public class Singletone  {
    private String nume;
    private static Singletone instanta= null;

    private Singletone() {}
    public static synchronized Singletone getInstanta(){
        if(instanta==null){
            instanta = new Singletone();
        }

        return instanta;

        }
    }

