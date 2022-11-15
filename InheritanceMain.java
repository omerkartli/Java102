package DortKolon;

public class InheritanceMain {
    public static void main(String[] args) {
        Employee e1= new Employee("Ömer Kartlı","05545520978","omerka@gmail.com");
        e1.giris();
        Akademisyen a1= new Akademisyen("Murat Yıdız","54585668","murtayı@gmail.com","EEE","Prof");
        a1.cikis();
        a1.derseGir();
        Memur m1= new Memur("Tunahan çelik","556965","tc@gmail.com","çayhane","8-17");
        m1.calis();
        OgretimGorevlisi o1=new OgretimGorevlisi("tunahan çelik","554554554","tcelik@gmail.com","bilgisayar","prof","25");
        o1.getKapiNo();
        o1.giris();
        o1.senatoToplanti();
        o1.derseGir();
        Asistan as1= new Asistan("ahmet","5548578688","ahme@gmail.com","Bio","asistan","9-5");
        as1.quizYap();
        LabAsistan l1 =new LabAsistan("ilkan","5545868755","ilk@gmail.com","fizik","asistan","9-15");
        l1.lablaragir();
        l1.derseGir();
        BilgiIslem b1= new BilgiIslem("mehmet","54586884","meh@gmail.com","eee","9-17","networkkur");
        b1.networkKur();
        GuvGor g1= new GuvGor("samet","45685","sam@gmail.com","Fabr","17-02","A2");
        g1.nobet();



    }
}
