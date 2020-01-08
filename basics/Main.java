public class Main {
    public static void main(String[] args){
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
}


    public static String pluralize(String word,int count ){
        if (count > 1 || count == 0){
        return (word + "s");
        }else{
        return (word);
    }
    
}

/////FlipNHeads////

    public static void flipNHeads(int n) {
    //     int headsCounter = 0;
    //     int flips = 0;
    //     while (headsCounter != n){
    //         flips++;
    //         headsCounter = 0;
    //         for (int i = 0; i < 20; i++){
    //     int rand = (int)(Math.random() * .5);
    //     //gives a random number between 0-1 and saves it in the variable rand
    //     if (rand == 0){
    //         System.out.println("heads");
    //         headsCounter++;
    //     
    //     else if (rand == 1){
    //         System.out.println("tails");
    //     }
    // }
    // System.out.println("It took" + flips + "flips to flip" + n + "heads in a row.");
    // }
            int headsCounter = 0
            while (headsCounter < n)



}



}
