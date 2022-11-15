package DortKolon;

public class Akademisyen extends Employee{// extends den sonra kalıtım yapılan sınıf

    private String bolum;
    private String unvan;

    public Akademisyen(String name, String phoneNumber, String email,String bolum, String unvan){
        super(name, phoneNumber, email); // super üste yazılmalı ve kalıtım yapılan sınıfın contructure ı yazılmalı
        this.bolum = bolum;
        this.unvan = unvan;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getName()+" derse girdi");
    }
}
