package com.searchit.tfg.dataset.retrieve;

public class ZomatoWebOrder {

    private String restaurantID;
    private String restaurantName;
    private String countryCode;
    private String city;
    private String address;
    private String locality;
    private String localityVerbose;
    private String longitude;
    private String latitude;
    private String cuisines;
    private String averageCostForTwo;
    private String currency;
    private String hasTableBooking;
    private String hasOnlineDelivery;
    private String isDeliveringNow;
    private String priceRange;
    private String aggregateRating;
    private String ratingColor;
    private String ratingText;
    private String votes;
    private String thumbURL;
    private String phoneNumber;

    public String getPhoneNumber() {
        return getPure(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int retryNo;

    public int getRetryNo() {
        return retryNo;
    }

    public void setRetryNo(int retyNo) {
        this.retryNo = retyNo;
    }

    public String getThumbURL() {
        return getPure(thumbURL);
    }

    public void setThumbURL(String thumbURL) {
        this.thumbURL = thumbURL;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setLocalityVerbose(String localityVerbose) {
        this.localityVerbose = localityVerbose;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public void setAverageCostForTwo(String averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setHasTableBooking(String hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public void setHasOnlineDelivery(String hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public void setIsDeliveringNow(String isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    public String getRestaurantID() {
        return getPure(restaurantID);
    }

    public String getRestaurantName() {
        return getPure(restaurantName);
    }

    public String getCountryCode() {
        return getPure(countryCode);
    }

    public String getCity() {
        return getPure(city);
    }

    public String getAddress() {
        return getPure(address);
    }

    public String getLocality() {
        return getPure(locality);
    }

    public String getLocalityVerbose() {
        return getPure(localityVerbose);
    }

    public String getLongitude() {
        return getPure(longitude);
    }

    public String getLatitude() {
        return getPure(latitude);
    }

    public String getCuisines() {
        return getPure(cuisines);
    }

    public String getAverageCostForTwo() {
        return getPure(averageCostForTwo);
    }

    public String getCurrency() {
        return getPure(currency);
    }

    public String getHasTableBooking() {
        return getPure(hasTableBooking);
    }

    public String getHasOnlineDelivery() {
        return getPure(hasOnlineDelivery);
    }

    public String getIsDeliveringNow() {
        return getPure(isDeliveringNow);
    }

    public String getPriceRange() {
        return getPure(priceRange);
    }

    public String getAggregateRating() {
        return getPure(aggregateRating);
    }

    public String getRatingColor() {
        return getPure(ratingColor);
    }

    public String getRatingText() {
        return getPure(ratingText);
    }

    public String getVotes() {
        return getPure(votes);
    }

    public String getPure(String input){
        return input.replaceAll("^\"|\"$","");
    }

    public ZomatoWebOrder() {
    }

    public ZomatoWebOrder(String restaurantID, String restaurantName, String countryCode, String city, String address, String locality, String localityVerbose, String longitude, String latitude, String cuisines, String averageCostForTwo, String currency, String hasTableBooking, String hasOnlineDelivery, String isDeliveringNow, String priceRange, String aggregateRating, String ratingColor, String ratingText, String votes) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.countryCode = countryCode;
        this.city = city;
        this.address = address;
        this.locality = locality;
        this.localityVerbose = localityVerbose;
        this.longitude = longitude;
        this.latitude = latitude;
        this.cuisines = cuisines;
        this.averageCostForTwo = averageCostForTwo;
        this.currency = currency;
        this.hasTableBooking = hasTableBooking;
        this.hasOnlineDelivery = hasOnlineDelivery;
        this.isDeliveringNow = isDeliveringNow;
        this.priceRange = priceRange;
        this.aggregateRating = aggregateRating;
        this.ratingColor = ratingColor;
        this.ratingText = ratingText;
        this.votes = votes;
    }

    @Override
    public String toString() {
        return  "restaurantID='" + restaurantID + '\'' + "\n"+
                "restaurantName='" + restaurantName + '\'' +"\n"+
                "countryCode='" + countryCode + '\'' +"\n"+
                "city='" + city + '\'' +"\n"+
                "address='" + address + '\'' +"\n"+
                "locality='" + locality + '\'' +"\n"+
                "localityVerbose='" + localityVerbose + '\'' +"\n"+
                "longitude='" + longitude + '\'' +"\n"+
                "latitude='" + latitude + '\'' +"\n"+
                "cuisines='" + cuisines + '\'' +"\n"+
                "averageCostForTwo='" + averageCostForTwo + '\'' +"\n"+
                "currency='" + currency + '\'' +"\n"+
                "hasTableBooking='" + hasTableBooking + '\'' +"\n"+
                "hasOnlineDelivery='" + hasOnlineDelivery + '\'' +"\n"+
                "isDeliveringNow='" + isDeliveringNow + '\'' +"\n"+
                "priceRange='" + priceRange + '\'' +"\n"+
                "aggregateRating='" + aggregateRating + '\'' +"\n"+
                "ratingColor='" + ratingColor + '\'' +"\n"+
                "ratingText='" + ratingText + '\'' +"\n"+
                "votes='" + votes + '\'' +"\n"+
                "thumbURL='" + thumbURL + '\'' +"\n"+
                "phoneNumber='" + phoneNumber + '\'' +"\n";
    }
}
