public class TestDraco {
    public static void main(String[] args) {
        showDraco();
    }

    public static void showDraco(){
        Wizard draco = new Wizard("Draco Malfoy", "Male","Lord Voldemort","None","Slytherin");

        System.out.println("Name: "+ draco.getName() +
                "\nGender: "+ draco.getGender() +
                "\nBoggart: "+ draco.getBoggart() +
                "\nPatronus: "+ draco.getPatronus() +
                "\nHouse: "+ draco.getHouse());
    }
}
