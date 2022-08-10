package DZ001;

public class Pacifier extends Kids {
    public Pacifier(String name, int price, int quantity, String unit, int minAge, String hypoallergenic){
        super(name, price, quantity, unit, minAge, hypoallergenic);
    }
    @Override
    public String toString(){
        return String.format("%s\n", super.toString());
    }
    
}
