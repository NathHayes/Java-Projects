public class GroveTester {
    public static void main(String[] args){
        
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1.toString());

        Tree spruce1 = new Tree(37,"Spruce");
        for(int i = 0; i < 6; i++){
            grove1.addTree(spruce1);
        }
        System.out.println(grove1.toString());

        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1.toString());

        Tree maple1 = new Tree(13,"Maple");
        grove1.addTree(maple1);
        System.out.println(grove1.toString());
    }
}