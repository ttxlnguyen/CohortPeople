package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String beverage;
    private String favColor;
    private String birthMonth;
    private boolean pets;

    public Person(String fname, String lname, String drink, String color, String month, String pets) {
        this.firstname = fname;
        this.lastname = lname;
        this.beverage = drink;
        this.favColor = color;
        this.birthMonth = month;
        this.pets = Boolean.valueOf(pets);
    }

    //Getter and Setter for firstname
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    //Getter and Setter for lastname
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //Getter and Setter for beverage
    public String getBeverage() {
        return beverage;
    }
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
    //Getter and setter for favorite color
    public String getFavColor() {
        return favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
    //Getter and setter for birth month
    public String getBirthMonth() {
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }
    //Getter and Setter for pets
    public boolean isPets() {
        return pets;
    }
    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.beverage + ", " + this.favColor + ", " + this.birthMonth + ", " + this.pets;
    }

}
