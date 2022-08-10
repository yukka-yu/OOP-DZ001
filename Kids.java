package DZ001;

public class Kids extends Product{
    int minAge;
    String hypoallergenic;

    public Kids(String name, int price, int quantity, String unit, int minAge, String hypoallergenic){

        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    // @Override
    // public String toString(){
    //     return String.format("%s\n")
    // }
}
