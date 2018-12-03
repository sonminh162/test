public class RatList {
    private Rat[] rats = new Rat[5];
    private int nextIndex =0;
    public void add(Rat rat){
        if(nextIndex < rats.length){
            rats[nextIndex]= rat;
            System.out.println("Rat added at "+nextIndex);
            nextIndex++;
        }
    }
    public boolean findName(String name){
        for(int i =0;i < rats.length;i++){
            if(rats[i].getName()==name)return true;
        }
        return false;
    }
    public void displayName(){
        for(int i =0;i < rats.length-1;i++){
            if(rats[i].getName().compareTo(rats[i+1].getName())<0){
                String temp = rats[i].getName();
            }
        }
    }
}
