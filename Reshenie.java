package Calculator;

public  class Reshenie {


    public int numm;
    String p = "+";
    String m = "-";
    String u = "*";
    String d = "/";


    public int resh (int x, int y, String r) {

        if (r.equals(p)) {
            numm = x + y;
            return numm;
        } else if (r.equals(m)) {
            numm = x - y;
            return numm;
        } else if (r.equals(u)) {
            numm = x * y;
            return numm;
        } else if (r.equals(d)) {
            numm = (int) x / y;
            return numm;
        } else {
            System.out.println("Nevernaya operaciya");
        }
        return numm;
    }

}

