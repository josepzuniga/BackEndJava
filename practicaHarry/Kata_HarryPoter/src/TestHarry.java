public class TestHarry {
    public static void main(String[] args) {
        showHarry();
    }

    public static void showHarry(){
        Wizard harry = new Wizard("Harry Potter", "Male","Dementor","Stag","Gryffindor");

        System.out.println("Name: "+harry.getName()+
                "\nGender: "+harry.getGender()+
                "\nBoggart: "+ harry.getBoggart()+
                "\nPatronus: "+harry.getPatronus()+
                "\nHouse: "+ harry.getHouse());
    }
}
