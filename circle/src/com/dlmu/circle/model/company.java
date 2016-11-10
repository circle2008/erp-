package com.dlmu.circle.model;

/**
 * Created by cf on 2016/11/10.
 */
public class company {
    int id;
    String cname;
    String cdesc;
    String cartificial;
    String cpassword;
    String country;
    String province;
    String city;
    String block;
    String postcode;

    public company() {
        super();
    }

    public company(String cname, String cartificial, String cpassword) {
        super();
        this.cname = cname;
        this.cartificial = cartificial;
        this.cpassword = cpassword;
    }


    public company(String cname, String cdesc, String cartificial, String cpassword, String country, String province, String city, String block, String postcode) {
        this.cname = cname;
        this.cdesc = cdesc;
        this.cartificial = cartificial;
        this.cpassword = cpassword;
        this.country = country;
        this.province = province;
        this.city = city;
        this.block = block;
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public String getCartificial() {
        return cartificial;
    }

    public void setCartificial(String cartificial) {
        this.cartificial = cartificial;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
