package Laevad;

public class purjelaev implements Andmed {

    double tuul;
    double mootor;
    double tuuleSuund;
    double suund1;

    public purjelaev(double tuul, double mootor, double tuuleSuund, double suund1){
        this.tuul = tuul;
        this.mootor = mootor;
        this.tuuleSuund = tuuleSuund;
        this.suund1 = suund1;
    }

    @Override
    public double kiirus() {
        if(suund1 == tuuleSuund){
            return tuul + mootor;
        }
        else{
            return mootor - tuul;
        }
    }

    @Override
    public double suund() {
        return ((tuuleSuund + suund1)/2);
    }
}
