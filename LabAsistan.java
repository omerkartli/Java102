package DortKolon;

public class LabAsistan extends Asistan{
    public LabAsistan(String name, String phoneNumber, String email, String bolum, String unvan, String ofissaati) {
        super(name, phoneNumber, email, bolum, unvan, ofissaati);
    }
    public void lablaragir(){
        System.out.println(this.getName()+" "+this.getBolum()+"için "+" lablarına gir ya");
    }
    public void derseGir(){
        System.out.println(this.getName()+"overriding yaptı derslere girmeye başadı");
    }
}
