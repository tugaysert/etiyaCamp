package entities;

public class Customer extends Person{
    private int cityId;

    public Customer(int id, String firstName, String lastName, int yearOfBirth, String nationalIdentity, int cityId) {
        super(id, firstName, lastName, yearOfBirth, nationalIdentity);
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
