public class GameRatAndCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",10);
        Rat rat = new Rat("Jelly",13,10);
        cat.run();
        rat.run();
        cat.catchRat(rat);
        if(cat.catchRat(rat))cat.eat(rat);

        Cat cat1 = new Cat("a",10);
        Cat cat2 = new Cat("b",10);
        Cat cat3 = new Cat("c",10);

        Rat rat1 = new Rat("jerry",13,10);
        Rat rat2 = new Rat("sexy",13,10);
        Rat rat3 = new Rat("ChitChit",13,10);

        CatList cats = new CatList();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        RatList rats = new RatList();
        rats.add(rat1);
        rats.add(rat2);
        rats.add(rat3);

        if(rats.findName("ChitChit"))
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
    }
}
