public class TestRon {
    public static void main(String[] args) {
        showRon();
    }

    public static void showRon(){
        Wizard Ron = new Wizard("Ron Weasley", "Male","Aragog","Jack Russell terrier","Gryffindor");

        System.out.println("Name: "+Ron.getName()+
                "\nGender: "+Ron.getGender()+
                "\nBoggart: "+ Ron.getBoggart()+
                "\nPatronus: "+Ron.getPatronus()+
                "\nHouse: "+ Ron.getHouse());
    }
}
