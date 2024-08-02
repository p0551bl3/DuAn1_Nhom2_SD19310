/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Promo {
    private int idpromo;
    private String namepromo;
    private String discountpromo;
    private String startpromo;
    private String endpromo;
    private String description;

    public void setIdpromo(int idpromo) {
        this.idpromo = idpromo;
    }

    public void setNamepromo(String namepromo) {
        this.namepromo = namepromo;
    }

    public void setDiscountpromo(String discountpromo) {
        this.discountpromo = discountpromo;
    }

    public void setStartpromo(String startpromo) {
        this.startpromo = startpromo;
    }

    public void setEndpromo(String endpromo) {
        this.endpromo = endpromo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdpromo() {
        return idpromo;
    }

    public String getNamepromo() {
        return namepromo;
    }

    public String getDiscountpromo() {
        return discountpromo;
    }

    public String getStartpromo() {
        return startpromo;
    }

    public String getEndpromo() {
        return endpromo;
    }

  

    public String getDescription() {
        return description;
    }
}
