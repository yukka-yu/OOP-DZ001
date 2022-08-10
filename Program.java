package DZ001;
public class Program {

    public static void main(String [] args){

        Product product = new Product("apple", 159, 30, "kg");
        System.out.println(product.toString());

        Food food = new Food("minestrone", 210, 40, "plate", "18.08.2022");
        System.out.println(food.toString());

        Drink drink = new Drink("ale", 120, 15, "bottle", 500);
        System.out.println(drink);

        Kids kids = new Kids("rattler", 380, 5, "box", 0,"yes");
        System.out.println(kids);

       Hygiene hygiene = new Hygiene("Cotton pads", 230, 38, "pack", 200);
       System.out.println(hygiene);

       Eggs eggs = new Eggs("Петелино eggs", 89, 30, "box", "05.09.2022", 20);
       System.out.println(eggs);

       Lemonade lemonade = new Lemonade("Sprite", 90, 20, "bottle", 1000);
       System.out.println(lemonade);
        
        Milk milk = new Milk("Простоквашино milk", 85, 30, "bottle", 930, 3.2, "20.08.2022");
        System.out.println(milk);
        
        Bread bread = new Bread("Baguette bread", 60, 28, "baguette", "19.08.2022", "wheat");
        System.out.println(bread);

       Pacifier pacifier = new Pacifier("Latex pacifier", 480, 10, "box", 0, "Absolutely");
       System.out.println(pacifier);

       Pampers pampers = new Pampers("Huggies", 890, 15, "pack", 0, "hyppoalergenic", "small", 5, 7,"panties");
       System.out.println(pampers);

       Masks masks = new Masks("cotton masks", 300, 80, "pack", 2);
       System.out.println(masks);

       ToiletPaper tp = new ToiletPaper("Zewa", 249, 10, "pack", 4, 3);
       System.out.println(tp);



    }
    
}
