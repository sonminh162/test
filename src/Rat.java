public class Rat extends Animal implements FourFootAnimalCanDo {
    private String name;
    private int weight;
    private int speed;
    public Rat(){
    }
    public Rat(String name, int weight, int speed){
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    @Override
    public void run(){
        System.out.println("Chuột đang chạy với tốc độ:"+speed);
    }
    @Override
    public void swim(){
    }
    @Override
    public String toString(){
        return "Chuột "+name+" ,nặng "+weight+"kg, tốc độ:"+ speed;
    }
}
