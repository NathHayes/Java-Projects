public class PatientTester {
    public static void main(String[] args){
        
        PatientManager manager1 = new PatientManager();
        System.out.println(manager1.toString());
        for(int i = 1; i < 5; i++){
            manager1.addPatient(new Patient(i,200*i));
        }
        System.out.println(manager1.toString());

        manager1.caffeineAbsorption();
        manager1.caffeineAbsorption();

        System.out.println(manager1.toString());
       
        manager1.removePatient(1);

        System.out.println(manager1.toString());

    }
}