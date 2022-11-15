package DortKolon;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String name, String phoneNumber, String email, String department, String mesai, String gorev) {
        super(name, phoneNumber, email, department, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public void networkKur(){
        System.out.println(this.getName()+"kurulum yapar");
    }
}
