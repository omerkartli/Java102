package DortKolon;

public class GuvGor extends Memur{
    private String belge;

    public GuvGor(String name, String phoneNumber, String email, String department, String mesai, String belge) {
        super(name, phoneNumber, email, department, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getName()+" saatleri arsı nöbet tutar");
    }
}
