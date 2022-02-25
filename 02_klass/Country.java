public class Country{
    String name;
    int strength;
    boolean imdependent;
    String info;

    public Country(String name, int strength, boolean imdependent){
        this.name = name;
        this.strength = strength;
        this.imdependent = imdependent;

        countryInfo();

    }

    public void countryStrong(){
        if(this.strength >= 50){
            System.out.println(this.name + " STRONK!");
        }
        else{
            System.out.println(this.name + " WEAK!");
        }
    }

    public void countryInfo(){
        if(this.imdependent == true){
            this.info = "Yes";
        }
        else{
            this.info = "No";
        }
    }


    @Override
    public String toString() {
        return "Name: " + name +
                "\nStrength: " + strength +
                "\nImdependent: " + info;
    }
}
