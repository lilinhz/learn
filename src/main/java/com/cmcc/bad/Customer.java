package com.cmcc.bad;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by leelyn on 2016/11/28.
 */
public class Customer {

    private String _name;                        //����

    private Vector _rentals = new Vector();        //����

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
        double totalAmount = 0;        //�����ѽ�

        int frequentRenterPoints = 0;        //���ͻ���

        Enumeration rentals = _rentals.elements();

        String result = "Rental Record for " + get_name() + "\n";

        while (rentals.hasMoreElements()) {

            double thisAmount = 0;

            Rental each = (Rental) rentals.nextElement();        //ȡ��һ�����ǡ�

            //determine amounts for each line

            switch (each.get_movie().get_priceCode()) {        //ȡ��ӰƬ����۸�

                case Movie.REGULAR:                        //��ͨƬ

                    thisAmount += 2;

                    if (each.get_daysRented() > 2)

                        thisAmount += (each.get_daysRented() - 2) * 1.5;

                    break;

                case Movie.NEW_RELEASE:                //��Ƭ

                    thisAmount += each.get_daysRented() * 3;

                    break;

                case Movie.CHILDRENS:                //��ͯ��

                    thisAmount += 1.5;

                    if (each.get_daysRented() > 3)

                        thisAmount += (each.get_daysRented() - 3) * 1.5;

                    break;


            }


            // add frequent renter points        ���ۼƳ��ͻ��㡣

            frequentRenterPoints++;

            // add bonus for a two day new release rental

            if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE) &&

                    each.get_daysRented() > 1) frequentRenterPoints++;


            //show figures for this rental����ʾ�˱�����¼��

            result += "\t" + each.get_movie().get_title() + "\t" +

                    String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;


        }

        //add footer lines����β��ӡ��

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";

        result += "You earned " + String.valueOf(frequentRenterPoints) +

                " frequent renter points";

        return result;


    }
}
