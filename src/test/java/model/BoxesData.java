package model;

import java.util.Objects;

public final class BoxesData {
    private final String username;
    private final String email;
    private final String address;
    private final String pAdress;

    public BoxesData(String username, String email, String address, String pAdress) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.pAdress = pAdress;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    public String address() {
        return address;
    }

    public String pAdress() {
        return pAdress;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BoxesData) obj;
        return Objects.equals(this.username, that.username) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.address, that.address) &&
                Objects.equals(this.pAdress, that.pAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, address, pAdress);
    }

    @Override
    public String toString() {
        return "BoxesData[" +
                "username=" + username + ", " +
                "email=" + email + ", " +
                "address=" + address + ", " +
                "pAdress=" + pAdress + ']';
    }

}