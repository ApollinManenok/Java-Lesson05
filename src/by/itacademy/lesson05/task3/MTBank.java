package by.itacademy.lesson05.task3;

public class MTBank extends BaseATM implements OrganizationInfo, ManufacturerInfo{
private String organization;
private String manufacturer;

    @Override
    public void printManufacturer() {
        System.out.println("Manufacturer: "+manufacturer);
    }

    @Override
    public void printOrganization() {
        System.out.println("Owner organization: "+organization);
    }

    public MTBank(int banknote20, int banknote50, int banknote100, String organization, String manufacturer) {
        super(banknote20, banknote50, banknote100);
        this.organization = organization;
        this.manufacturer = manufacturer;
    }
}
