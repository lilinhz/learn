package com.cmcc.inheritance;

/**
 * Created by leelyn on 2016/11/28.
 */
public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;


    private String _title;        //����

    private int _priceCode;        //�۸񣨴��ţ�

    public Movie(int _priceCode, String _title) {
        this._priceCode = _priceCode;
        this._title = _title;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public Double getCharge(int daysRented) {
        Double result = 0D;
        switch (get_priceCode()) {        //ȡ��ӰƬ����۸�
            case REGULAR:                        //��ͨƬ
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:                //��Ƭ
                result += daysRented * 3;
                break;
            case CHILDRENS:                //��ͯ��
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (get_priceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
