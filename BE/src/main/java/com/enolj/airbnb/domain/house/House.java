package com.enolj.airbnb.domain.house;

import org.springframework.data.annotation.Id;

public class House {

    @Id
    private Long id;
    private String name;
    private String description;
    private int charge;
    private String option;
    private String host;
    private double grade;
    private int review;
    private double latitude;
    private double longitude;
    private int discountRatio;
    private int cleaningRatio;
    private int serviceRatio;

    public boolean checkCharge(int minCharge, int maxCharge) {
        return minCharge <= charge && charge <= maxCharge;
    }

    public boolean checkLocation(double latitude, double longitude) {
        return (latitude - 0.001 <= this.latitude && this.latitude <= latitude + 0.001)
                && (longitude - 0.001 <= this.longitude && this.longitude <= longitude + 0.001);
    }

    public String makeLocation() {
        return "서초구, 서울, 한국";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(int discountRatio) {
        this.discountRatio = discountRatio;
    }

    public int getCleaningRatio() {
        return cleaningRatio;
    }

    public void setCleaningRatio(int cleaningRatio) {
        this.cleaningRatio = cleaningRatio;
    }

    public int getServiceRatio() {
        return serviceRatio;
    }

    public void setServiceRatio(int serviceRatio) {
        this.serviceRatio = serviceRatio;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", charge=" + charge +
                ", option='" + option + '\'' +
                ", host='" + host + '\'' +
                ", grade=" + grade +
                ", review=" + review +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", discountRatio=" + discountRatio +
                ", cleaningRatio=" + cleaningRatio +
                ", serviceRatio=" + serviceRatio +
                '}';
    }
}