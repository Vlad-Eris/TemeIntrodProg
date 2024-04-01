
public class PunctColorat extends Punct {
	
    private String c;

    public PunctColorat(double x, double y, String c) {
        super(x, y);
        this.c = c;
    }
    
}

//Da, este nevoie de creearea unui constructor in clasa PunctColorat, deoarece campul c nu poate fi initatilizat
//din clasa de baza Punct.