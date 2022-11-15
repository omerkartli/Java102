package DortKolon;

public class Main {
    //Encapsulation
    //Inheritance
    //Poli-morphism
    //Abstraction
    public static void main(String[] args) {
        Book sefiller = new Book("Sefiller", 500);
        Book kasagi= new Book("Kaşağı",-200);

        kasagi.setPageNumber(-100);
        kasagi.setName("KAŞAĞI1");

        System.out.println(kasagi.getPageNumber());
        System.out.println(kasagi.getName());
    }

}
