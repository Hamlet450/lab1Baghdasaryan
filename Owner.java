public class Owner {
    private String name;
    private String licenseNumber;
    private String phoneNumber;

    public Owner(String name, String licenseNumber, String phoneNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + ", License: " + licenseNumber + ", Phone: " + phoneNumber;
    }
}

