package com.moretickets.platform.show;


import java.util.List;

//剧院的信息
public class theatreVO {

    private String theatreName;
    private String theatreAddress;
    private String route;
    private String province;
    private String cityName;
    private String lat;
    private String lng;
    private String description;
    private String contact;
    private String phone;
    private String status;
    private List<theatrePosterVO> posters;

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreAddress() {
        return theatreAddress;
    }

    public void setTheatreAddress(String theatreAddress) {
        this.theatreAddress = theatreAddress;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<theatrePosterVO> getPosters() {
        return posters;
    }

    public void setPosters(List<theatrePosterVO> posters) {
        this.posters = posters;
    }

    @Override
    public String toString() {
        return "theatreVO{" +
                "theatreName='" + theatreName + '\'' +
                ", theatreAddress='" + theatreAddress + '\'' +
                ", route='" + route + '\'' +
                ", province='" + province + '\'' +
                ", cityName='" + cityName + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", description='" + description + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", posters=" + posters +
                '}';
    }
}
