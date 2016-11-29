package com.cmcc.good1;

/**
 * Created by leelyn on 2016/11/28.
 */
public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;


    private String _title;        //名称

    private int _priceCode;        //价格（代号）

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
}
