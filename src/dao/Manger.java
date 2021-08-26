package dao;

public class Manger {
    private String MName;
    private String MPassword;

    public Manger() {
    }

    public Manger(String MName, String MPassword) {
        this.MName = MName;
        this.MPassword = MPassword;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMPassword() {
        return MPassword;
    }

    public void setMPassword(String MPassword) {
        this.MPassword = MPassword;
    }
}
