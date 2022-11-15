package DortKolon;

public class Asistan extends Akademisyen{
    private String ofissaati;

    public Asistan(String name, String phoneNumber, String email, String bolum, String unvan, String ofissaati) {
        super(name, phoneNumber, email, bolum, unvan);
        this.ofissaati = ofissaati;
    }

    public String getOfissaati() {
        return ofissaati;
    }

    public void setOfissaati(String ofissaati) {
        this.ofissaati = ofissaati;
    }
    public void quizYap(){
        System.out.println(this.getName()+ " "+ this.getUnvan()+ " "+this.getBolum()+" bölümü için sınav yap");
    }
}
