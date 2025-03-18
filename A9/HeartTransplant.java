/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {
        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null; 
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {
        return patients;
        }

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        patients=new Patient[numberOfLines];

        for (int i = 0; i < patients.length; i++){
            
            Patient one = new Patient(StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
                patients[i] = one;
        }

    }
    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines){
        survivabilityByAge = new SurvivabilityByAge();
            for (int i = 0; i < numberOfLines; i++){

            int age = StdIn.readInt();
            int yearsPT = StdIn.readInt();
            double rate = StdIn.readDouble();

            survivabilityByAge.addData(age, yearsPT, rate);
        }
    }



    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines){
        survivabilityByCause = new SurvivabilityByCause();
            for (int i = 0; i < numberOfLines; i++){

            int cause = StdIn.readInt();
            int yearsPT = StdIn.readInt();
            double rate = StdIn.readDouble();

            survivabilityByCause.addData(cause, yearsPT, rate);
        }
    }

    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age){
        int x = 0;
        for (int i = 0; i < patients.length; i++){

            if (patients[i].getAge() >= age){
                x++;
            }
        }
    
        Patient[] PatientsAgeArray = new Patient[x];
        int y = 0; 
        if (x == 0){

            return null; 
        
        }
        else{
    
        for (int i = 0; i < patients.length; i++){
            
            if (patients[i].getAge() >= age){
            
                PatientsAgeArray[y] = patients[i];
                    y++;
                }
            }
        }
    return PatientsAgeArray;
}


    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause){
        int personsheart = 0; 

        for (int i = 0; i < patients.length; i++){

            if (patients[i].getCause() == cause){
                personsheart++;
         }
    }

        Patient[] PatientCauseArray = new Patient[personsheart];
        int x = 0;

        for(int i = 0; i< patients.length; i++){

            if(patients[i].getCause() == cause){
                PatientCauseArray[x] = patients[i];
                x++;
        }
    }

        if(personsheart>0){
            return PatientCauseArray;

    }
        
        return null;
  }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency){
        Patient [] patientUrgency;
        int numOfPatients = 0; 

            for (int i = 0; i < patients.length; i++){

            if (patients[i].getUrgency() == urgency){
                numOfPatients++;
            }
        }

        patientUrgency = new Patient [numOfPatients];
            for (int i = 0; i < patients.length; i++) {

            if (patients[i].getUrgency() == urgency){
                patientUrgency[numOfPatients] = patients[i];
                numOfPatients++;
            }
        }

        if(patientUrgency.length == 0){
        return null;
        }
            return patientUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant (){

        double max = 0;
        int w = -1; 

     for (int i = 0; i < patients.length; i++){

        if (patients[i].getUrgency() == 8 && patients[i].getNeedHeart() == true && survivabilityByCause.getRate(patients[i].getCause(), 5) > max){
            
            max = survivabilityByCause.getRate(patients[i].getCause(), 5);
                w = i;
    }
}
     if (w != -1){
        patients[w].setNeedHeart(false);
            return patients[w];
        }
        else{
            return null;
        }
    }
}