

public class App {
    

    public static void main(String[] args){
        System.out.println("---------------starting--------------");
        Engine e1 = new Engine("aaa",1111);
        Wheel w1 = new Wheel("lll", 4);
        Car c = new Car(e1 , w1);
       
        
        System.out.println("Engine:" + c.getEngine().getName() + " Power of engine: " + c.getEngine().getPower());
        System.out.println("wheel: " + c.getWheel().getName() + " number of wheel: " + c.getWheel().getNumber() );

        System.out.println("-------------------ending----------------\n");
        
    }
}
