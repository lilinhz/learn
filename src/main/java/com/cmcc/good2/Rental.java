package com.cmcc.good2;

import com.cmcc.bad.Movie;

/**
 * Created by leelyn on 2016/11/29.
 */
public class Rental {

    private Movie _movie;        //ӰƬ

    private int _daysRented;        //����

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    public Double getCharge() {
        Double result = 0D;
        switch (get_movie().get_priceCode()) {        //ȡ��ӰƬ����۸�
            case Movie.REGULAR:                        //��ͨƬ
                result += 2;
                if (get_daysRented() > 2)
                    result += (get_daysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:                //��Ƭ
                result += get_daysRented() * 3;
                break;
            case Movie.CHILDRENS:                //��ͯ��
                result += 1.5;
                if (get_daysRented() > 3)
                    result += (get_daysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}
