public class Tamagochi {
    int x;
    int y;
    int lunchBox;

    public void changePosition (String  direction, int steps){
        if (direction.equalsIgnoreCase("left")){
            x=x-steps;
        } else if (direction.equalsIgnoreCase("right")){
            x=x+steps;
        } else if (direction.equalsIgnoreCase("up")){
            y=y+steps;
        } else if (direction.equalsIgnoreCase("down")){
            y=y-steps;
        } else {
            System.out.println("Invalid direction");
        }

        lunchBox = lunchBox - steps;

    }

    public void feed (int newLunchBoxes){
        lunchBox = lunchBox + newLunchBoxes;
    }


}

