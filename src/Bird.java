public class Bird extends Animal{

    public void fly(){
        System.out.println("Bird is flying");
    }

    @Override
    public void makeSounds(){
        System.out.println("Birds chips");
    }
}
