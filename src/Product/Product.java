package Product;

public class Product {

        private String nameOfProduct;
        private double price;
        private int count;

    public Product(String nameOfProduct, double price, int count) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.count = count;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (count != product.count) return false;
        return nameOfProduct != null ? nameOfProduct.equals(product.nameOfProduct) : product.nameOfProduct == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameOfProduct != null ? nameOfProduct.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("nameOfProduct='").append(nameOfProduct).append('\'');
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
