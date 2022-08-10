package DZ001;

public class ToiletPaper extends Hygiene {
    int layers;

    public ToiletPaper(String name, int price, int quantity, String unit, int unitsPerPackage, int layers) {
        super(name, price, quantity, unit, unitsPerPackage);
        this.layers = layers;
    }

    @Override
    public String toString(){
        return String.format("%s\nlayers: %d", super.toString(), this.layers);
    }
    
}
