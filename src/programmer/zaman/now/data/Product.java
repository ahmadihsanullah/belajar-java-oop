package programmer.zaman.now.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int harga;

    public Product(String name, int harga){
        this.name = name;
        this.harga = harga;
    }

    public String toString(){
        return "product name:" + name + ", price:" + harga;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Product product = (Product) o;
//
//        if (harga != product.harga) return false;
//        return Objects.equals(name, product.name);
//    }


}
