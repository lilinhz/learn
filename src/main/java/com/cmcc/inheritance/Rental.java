package com.cmcc.inheritance;


/**
 * Created by leelyn on 2016/11/29.
 */
public class Rental {

    private com.cmcc.inheritance.Movie _movie;        //Ó°Æ¬

    private int _daysRented;        //×âÆÚ

    public Rental(com.cmcc.inheritance.Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public com.cmcc.inheritance.Movie get_movie() {
        return _movie;
    }

    public void set_movie(com.cmcc.inheritance.Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
