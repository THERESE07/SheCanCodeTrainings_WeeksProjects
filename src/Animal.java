public class Animal {
    private String name;
    private String sound;
    private String color;


    public void makeSounds(){
        System.out.println("Animals speaks: ");
    }

    public void makeSounds(String name, String sound){
        this.name = name;
        this.sound = sound;

        System.out.println("This Dog called" + name + "It" + sound);

    }

    public void makeSounds(String name,  String color, String sound){
        this.name = name;
        this.sound = sound;
        this.color= color;

        System.out.println("This CAT called" + name + " with a " + color + "color, " + "It" + sound);
    }
}
