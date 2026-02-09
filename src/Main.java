class Main{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.makeSounds();
        bird.fly();

        Animal animal = new Animal();
        animal.makeSounds();
        animal.makeSounds("Bobby", "Barks");
        animal.makeSounds("Mickey", "white", "Meow");
    }
}