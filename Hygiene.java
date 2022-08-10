package DZ001;

public class Hygiene extends Product {
    int unitsPerPackage;

    public Hygiene(String name, int price, int quantity, String unit, int unitsPerPackage){
        super(name, price, quantity, unit);
        this.unitsPerPackage = unitsPerPackage;
    }

    @Override
    public String toString(){
        return String.format("%s\nunit per package: %d", super.toString(), this.unitsPerPackage);
    }
    
}
