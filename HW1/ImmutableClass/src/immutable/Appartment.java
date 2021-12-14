package immutable;

import java.util.Objects;

public class Appartment {
    String address;
    boolean isDormitory;

    public Appartment(String address, boolean isDormitrory) {
        this.address = address;
        this.isDormitory = isDormitrory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDormitory() {
        return isDormitory;
    }

    public void setDormitory(boolean dormitory) {
        isDormitory = dormitory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appartment that = (Appartment) o;
        return isDormitory == that.isDormitory && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, isDormitory);
    }
}
