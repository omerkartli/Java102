package DortKolon;

public class Employee {
    private String name;
    private String phoneNumber;
    private String email;

    public Employee(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void giris(){
        System.out.println(this.name+" giris yaptı");
    }
    public void cikis(){
        System.out.println(this.name+" çıkış yaptı");
    }
    public void yemekhane(){
        System.out.println(this.name+" yemek yedi");
    }
}
