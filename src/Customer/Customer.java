package Customer;

public class Customer {
    private String nameCustomer;
    private String address;
    private int id;

    public Customer(int id, String nameCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.address = address;
        this.id = id;
    }


    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (nameCustomer != null ? !nameCustomer.equals(customer.nameCustomer) : customer.nameCustomer != null)
            return false;
        return address != null ? address.equals(customer.address) : customer.address == null;
    }

    @Override
    public int hashCode() {
        int result = nameCustomer != null ? nameCustomer.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("nameCustomer='").append(nameCustomer).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
