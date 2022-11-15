package DortKolon;

public class Memur extends Employee{

    private String department;
    private String mesai;

    Memur(String name, String phoneNumber, String email, String department, String mesai){
        super(name,phoneNumber, email);
        this.department=department;
        this.mesai=mesai;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(this.getName()+" calıştı");
    }
}
