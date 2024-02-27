package entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        if (feeding() > 30) {
            return 0.0;
        }

        return 4.0;
    }

    public double feeding() {

        return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
    }

    public double ticket() {
        if (gender == 'F') {
            return 8.0;
        }
        return 10.0;
    }

    public double total() {

        return cover() + feeding() + ticket();
    }


}
