package com.cmcc.inheritance;


import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by leelyn on 2016/11/28.
 */
public class Customer {

    private String _name;                        //姓名

    private Vector _rentals = new Vector();        //租借记

    public Customer(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String statement() {
        Enumeration rentals = _rentals.elements();

        String result = "Rental Record for " + get_name() + "\n";

        while (rentals.hasMoreElements()) {
            com.cmcc.polymorphism.Rental each = (com.cmcc.polymorphism.Rental) rentals.nextElement();        //取得一笔租借记。
            //show figures for this rental（显示此笔租借记录）
            result += "\t" + each.get_movie().get_title() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines（结尾打印）
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rentals for <EM>" + get_name() + "</EM></ H1><P>\n";
        while (rentals.hasMoreElements()) {
            com.cmcc.polymorphism.Rental each = (com.cmcc.polymorphism.Rental) rentals.nextElement();
            //show figures for each rental
            result += each.get_movie().get_title() + ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        //add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            com.cmcc.polymorphism.Rental each = (com.cmcc.polymorphism.Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
