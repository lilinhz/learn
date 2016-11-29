package com.cmcc.good1;

import com.cmcc.bad.Movie;

/**
 * Created by leelyn on 2016/11/28.
 */
public class Rental {

    private Movie _movie;        //Ó°Æ¬

    private int _daysRented;        //×âÆÚ

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
}
