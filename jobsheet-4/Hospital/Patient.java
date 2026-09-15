import java.util.ArrayList;
import java.time.LocalDate;

public class Patient {
    private String medicalRecordNum;
    private String name;
    private ArrayList<Consult> consultationHistory;

    public Patient(String medicalRecordNum, String name) {
        this.medicalRecordNum = medicalRecordNum;
        this.name = name;
        this.consultationHistory = new ArrayList<Consult>();
    }

    public String getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum (String medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addConsultation(LocalDate date, Employee doctor, Employee perawat) {
        Consult consultation = new Consult();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setNurse(perawat);
        consultationHistory.add(consultation);
    }   

    public String getInfo() {
        String info = "";
        info += "Medical Record Number  : " + this.medicalRecordNum + "\n";
        info += "Name                   : " + this.name + "\n";
        info += "\n";

        if(!consultationHistory.isEmpty()) {
            info+= "History Consultation :\n";

            for(Consult consultation : consultationHistory) {
                info += consultation.getInfo();
            }
        } else {
            info += "There is no consultation history yet";
        }

        info+= "\n";

        return info;
    }
}
