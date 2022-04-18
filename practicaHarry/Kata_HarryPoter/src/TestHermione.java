public class TestHermione {
    public static void main(String[] args) {
        showHermione();
    }


    public static void showHermione(){
        Wizard hermione = new Wizard("Hermione Granger", "Female","Failure","Otter","Gryffindor");

        System.out.println("Name: "+hermione.getName()+
                "\nGender: "+hermione.getGender()+
                "\nBoggart: "+ hermione.getBoggart()+
                "\nPatronus: "+hermione.getPatronus()+
                "\nHouse: "+ hermione.getHouse());
    }
}


