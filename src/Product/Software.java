package Product;

public class Software extends Product {

    private String version;
    private String operatingSystem;
    private String licenseKey;
    private int maxUsers;
    private String developer;
    private String downloadLink;

    public Software(String name,
                    String code,
                    String description,
                    double price,
                    String version,
                    String operatingSystem,
                    String licenseKey,
                    int maxUsers,
                    String developer,
                    String downloadLink) {

        super(name, code, description, price);

        this.version = version;
        this.operatingSystem = operatingSystem;
        this.licenseKey = licenseKey;
        this.maxUsers = maxUsers;
        this.developer = developer;
        this.downloadLink = downloadLink;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}