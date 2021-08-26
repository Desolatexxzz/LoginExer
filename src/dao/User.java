package dao;

public class User {
    private int uid;
    private String uname;
    private String ugender;
    private int uage;
    private String uaddress;
    private String uqq;
    private String uemail;

    public User() {
    }

    public User(int uid, String uname, String ugender, int uage, String uaddress, String uqq, String uemail) {
        this.uid = uid;
        this.uname = uname;
        this.ugender = ugender;
        this.uage = uage;
        this.uaddress = uaddress;
        this.uqq = uqq;
        this.uemail = uemail;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ugender='" + ugender + '\'' +
                ", uage=" + uage +
                ", uaddress='" + uaddress + '\'' +
                ", uqq='" + uqq + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }
}
