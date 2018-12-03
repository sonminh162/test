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

        Rat rat1 = new Rat("a",13,10);
        Rat rat2 = new Rat("b",13,10);
        Rat rat3 = new Rat("c",13,10);

        Cat[] catList = new Cat[3];
        catList[0] = cat1;
        catList[1] = cat2;
        catList[2] = cat3;

        Rat[] ratList = new Rat[3];
        ratList[0] = rat1;
        ratList[1] = rat2;
        ratList[2] = rat3;


    }
}
