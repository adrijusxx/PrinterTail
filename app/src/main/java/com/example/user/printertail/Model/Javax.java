package com.example.user.printertail.Model;

public class Javax {
    private Double Cash;
    private Double Visa;
    private Double Total;

    public Javax(Double cash, Double visa, Double total) {
        Cash = cash;
        Visa = visa;
        Total = total;
    }

    public Double getCash() {
        return Cash;
    }

    public void setCash(Double cash) {
        Cash = cash;
    }

    public Double getVisa() {
        return Visa;
    }

    public void setVisa(Double visa) {
        Visa = visa;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }
}
