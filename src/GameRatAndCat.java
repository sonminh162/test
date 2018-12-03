public class GameRatAndCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",10);
        Rat rat = new Rat("Jelly",13,10);
        cat.run();
        rat.run();
        cat.catchRat(rat);

        Cat cat1 = new Cat("a",10);
        Cat cat2 = new Cat("b",10);
        Cat cat3 = new Cat("c",10);

        Rat rat1 = new Rat("a",13,10);
        Rat rat2 = new Rat("b",13,10);
        Rat rat3 = new Rat("c",13,10);

        Cat[] catList = new Cat[3];
        for(int i = 1; i<= 3;i++){
        }
    }
}
