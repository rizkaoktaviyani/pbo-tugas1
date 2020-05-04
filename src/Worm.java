public class Worm {

    //attribute
    String userName;
    int score;
    double length;


    //behavior
    void eatSnack(){
        System.out.println("Yum...yum...yum...");
    }

    void eatOthers(Worm worm){
        score +=600;
    }
}
