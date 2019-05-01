package simonericgenlabo3;

public class Cup {


    private int total;
    private Die dice[];

    public Cup(Die dice[]){
        this.dice = dice;
        roll();
    }

    public void roll(){
        total = 0;
        for (int i = 0; i < dice.length; i++){
            dice[i].roll();
            total += dice[i].getFaceValue();
        }
    }

    public int getTotal() {
        return total;
    }
}
