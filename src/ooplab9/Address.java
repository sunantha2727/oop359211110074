package ooplab9;

public class Address {
    private String homeNo;
    private String provinco;
    private String posCode;

    public Address(String homeNo, String provinco, String posCode) {
        this.homeNo = homeNo;
        this.provinco = provinco;
        this.posCode = posCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", provinco='" + provinco + '\'' +
                ", posCode='" + posCode + '\'' +
                '}';
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvinco() {
        return provinco;
    }

    public void setProvinco(String provinco) {
        this.provinco = provinco;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }
}
