public class Cat extends Animal implements FourFootAnimalCanDo {
    private String name;
    private int speed;
    public Cat(){
    }
    public Cat(String name,int speed){
        this.name = name;
        if(speed>=0)this.speed = speed;
        else System.out.println("ERROR: Tốc độ không hợp lệ!");
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public void run(){
        System.out.println("Mèo đang chạy với tốc độ:"+speed);
    }

    @Override
    public void swim() {
    }

    public boolean catchRat(Rat rat){
        if(speed >= rat.getSpeed()) return true;
        return false;
    }
    public void eat(Rat food){
        if(food.getWeight()<10) System.out.println("Mum mum, chuột hơi gầy");
        else if(food.getWeight()>10) System.out.println("Mum mum, chuột béo đấy");
        else {
            System.out.println("Meo meo, đói");
        }
    }
}
