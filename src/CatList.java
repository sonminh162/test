public class CatList {
    private Cat[] cats = new Cat[5];
    private int nextIndex =0;
    public void add(Cat cat){
        if(nextIndex < cats.length){
            cats[nextIndex]= cat;
            System.out.println("Cat added at "+nextIndex);
            nextIndex++;
        }
    }
}
