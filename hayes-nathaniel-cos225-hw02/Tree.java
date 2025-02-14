public class Tree {
    public Integer idNumber;
    public Integer id = 0;
    public Integer age;
    public String species;

    public Tree(){
        idNumber = 0;
        age = 0;
        species = "oak";
    }

    public Tree(Integer age, String species){
        this.idNumber = id;
        id += 1;
        this.age = age;
        this.species = species;
    }

    public String tostring(){
        return "ID Number: " + idNumber + " Age: " + 
        age + "Species: " + species;
    }
}
