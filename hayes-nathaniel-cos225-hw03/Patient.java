public class Patient {
    public Integer idNumber;
    public Integer caffeineLevel;

    public Patient(Integer idNumber, Integer caffeineLevel){
       this.idNumber = idNumber;
       this.caffeineLevel = caffeineLevel;
    }
    public Integer getLevel(){
        return caffeineLevel;
    }
    public String toString(){
        return idNumber + " " + caffeineLevel;
    }
}
