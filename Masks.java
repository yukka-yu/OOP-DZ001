package DZ001;

public class Masks extends Hygiene {

    public Masks(String name, int price, int quantity, String unit, int unitsPerPackage) {
        super(name, price, quantity, unit, unitsPerPackage);
    }

    @Override
    public String toString(){
        return String.format("%s\n", super.toString());
    }
    
}
