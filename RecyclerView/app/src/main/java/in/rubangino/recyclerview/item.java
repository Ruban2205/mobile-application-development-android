package in.rubangino.recyclerview;

public class item {
    String name;
    String phone;
    int image;

    public item(String name, String email, int image) {
        this.name = name;
        this.phone = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
