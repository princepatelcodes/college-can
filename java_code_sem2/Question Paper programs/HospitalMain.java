class Hospital {
    String hospitalName = "Dippolo Hospital";
    String getHospitalName() {
        return hospitalName;
    }
}

class Doctor extends Hospital {
    public void treatPatient() {
        System.out.println("Doctor treats the patient");
    }
}

class Nurse extends Hospital {
    public void assessPatient() {
        System.out.println("Nurse assesses the patient");
    }
}

class Administrator extends Hospital {
    public void manageFinances() {
        System.out.println("Administrator manages finances");
    }
}

class Surgeon extends Hospital {
    public void performOperation() {
        System.out.println("Surgeon performs the operation");
    }
}

class Receptionist extends Hospital {
    public void greetPatient() {
        System.out.println("Receptionist greets the patient");
    }
}

class Janitor extends Hospital {
    public void clean() {
        System.out.println("Janitor cleans the hospital");
    }
}


public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println("The name of the hospital is " + hospital.getHospitalName());
        Doctor doctor = new Doctor();
        doctor.treatPatient();
        Nurse nurse = new Nurse();
        nurse.assessPatient();
        Administrator administrator = new Administrator();
        administrator.manageFinances();
        Surgeon surgeon = new Surgeon();
        surgeon.performOperation();
        Receptionist receptionist = new Receptionist();
        receptionist.greetPatient();
        Janitor janitor = new Janitor();
        janitor.clean();
    }
}