
package com.breakout.bestappone.content.udemyRight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceDetail implements Parcelable
{

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("price_string")
    @Expose
    private String priceString;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("currency_symbol")
    @Expose
    private String currencySymbol;
    public final static Creator<PriceDetail> CREATOR = new Creator<PriceDetail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PriceDetail createFromParcel(Parcel in) {
            return new PriceDetail(in);
        }

        public PriceDetail[] newArray(int size) {
            return (new PriceDetail[size]);
        }

    }
    ;

    protected PriceDetail(Parcel in) {
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.priceString = ((String) in.readValue((String.class.getClassLoader())));
        this.amount = ((Double) in.readValue((Double.class.getClassLoader())));
        this.currencySymbol = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PriceDetail() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currency);
        dest.writeValue(priceString);
        dest.writeValue(amount);
        dest.writeValue(currencySymbol);
    }

    public int describeContents() {
        return  0;
    }

}
