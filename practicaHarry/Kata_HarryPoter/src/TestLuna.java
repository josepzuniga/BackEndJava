public class TestLuna {
    public static void main(String[] args) {
        showLuna();
    }

    public static void showLuna(){
        Wizard luna = new Wizard("Luna Lovegood", "Female","Known","Hare","Revenclaw");

        System.out.println("Name: "+ luna.getName() +
                "\nGender: "+ luna.getGender() +
                "\nBoggart: "+ luna.getBoggart() +
                "\nPatronus: "+ luna.getPatronus() +
                "\nHouse: "+ luna.getHouse());
    }
}
