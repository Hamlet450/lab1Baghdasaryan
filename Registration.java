public class Registration {
    private String registrationNumber;
    private String state;
    private String expirationDate;

    public Registration(String registrationNumber, String state, String expirationDate) {
        this.registrationNumber = registrationNumber;
        this.state = state;
        this.expirationDate = expirationDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


    public String toString() {
        return registrationNumber + " (" + state + "), Expires: " + expirationDate;
    }
}

