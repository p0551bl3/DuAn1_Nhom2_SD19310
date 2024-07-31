/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class Sanpham {
    private int IDProduct;
    private String ProductName;
    private String IDType;
    private float Price;

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getIDType() {
        return IDType;
    }

    public float getPrice() {
        return Price;
    }
}
