import java.lang.reflect.Array;

public class Grove{
    public Tree trees[];
    public String groveName;
    public Integer occupied = 0;

    public Grove(){
        trees = new Tree[16];
        
        
    }


    public Grove(String groveName){
        trees = new Tree[16];
        this.groveName = groveName;



        // for (int i = 0; i < trees.length; i++){
        //     addTree(new Tree());
        // }

    }

    public int addTree(Tree tree){
        for (int i = 0; i < trees.length; i++){
            if (trees[i] == null){
                trees[i] = tree;
                occupied += 1;
                return i;
            }
        }
        return -1;
    }

    public int removeTree(Tree tree){
        for (int i = 0; i < trees.length; i++){
            if (trees[i] == tree){
                trees[i] = null;
                occupied -= 1;
                return i;
            }
        }
        return -1;
    }
    public int removeTree(Integer location){
        trees[location] = null;
        occupied -=1;
        return location;
    }


    public String toString(){
        return "" + occupied;
    }
}