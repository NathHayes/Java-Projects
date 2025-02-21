
public class PatientManager{
    public Patient patients[];
    public Integer occupied = 0;
    public Integer curPat = 0;
    public Integer curPatLvl = 0;
    public PatientManager(){
        patients = new Patient[10];
    }

    public int addPatient(Patient patient){
        for (int i = 0; i < patients.length; i++){
            if (patients[i] == null){
                patients[i] = patient;
                occupied += 1;
                return i;
            }
        }
        return -1;
    }

    public int removePatient(Patient patient){
        for (int i = 0; i < patients.length; i++){
            if (patients[i] == patient){
                patients[i] = null;
                occupied -= 1;
                return i;
            }
        }
        return -1;
    }

    public int removePatient(Integer type){ //0 for lowest, other for highest
        curPat = 0;
        curPatLvl = 0;
        for (int i = 0; i < patients.length; i++){
            if(patients[i] != null){
                if (type == 0 && patients[i].caffeineLevel < curPatLvl){
                    curPat = i;
                    curPatLvl =  patients[curPat].caffeineLevel;
                }
                else if(type != 0 && patients[i].caffeineLevel > curPatLvl){
                    curPat = i;
                    curPatLvl =  patients[curPat].caffeineLevel;
                }
            }
        }

        return removePatient(patients[curPat]);
    }

    
    public void caffeineAbsorption(){
        for (int i = 0; i < patients.length; i++){
            if (patients[i] != null){
                patients[i].caffeineLevel -= 160;
                if (patients[i].caffeineLevel <= 0){
                    patients[i] = null;
                    occupied -= 1;
                }  
            }
        }
    }


    public String toString(){
        String toReturn = "Empty";
        for (int i=0; i<patients.length;i++){
            if (patients[i] != null){
                toReturn+="\n";
                if (toReturn.contains("Empty")){
                    toReturn = "";
                }
                toReturn += patients[i].toString();
            }
        }
        return toReturn;
    }
}