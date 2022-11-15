package DortKolon;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String name, String phoneNumber, String email, String bolum, String unvan, String kapiNo) {
        super(name, phoneNumber, email, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getName()+" senato toplantı yaptı");
    }
    public void sinavYap(){
        System.out.println(this.getName()+" sınav yaptı");
    }
}
