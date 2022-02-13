package factoryDesignPattern.model;

import factoryDesignPattern.factories.IAdvert;

import java.math.BigDecimal;
import java.util.Date;

public class Advertisement implements IAdvert {

	private City city;
	private District district;
	private HomeType homeType;
	private String numberOfRooms ;
	private String numberOfHalls ;
	private String squareMeters; // sayısal işlem yapılmadığı için string alındı
	private String floorNumber; // sayısal işlem yapılmadığı için string alındı
	private AdvertisementType advertisementType; //İlan tipi : Kiralık - Satılık - Günlük kiralık
	private String title;
	private User user; // hem bireysel & kurumsal
	private String[] photoList;
	private BigDecimal price;
	private boolean turbo = false;
	private Date createdDate;
	private Date endDate;
	private boolean isActive;

	public Advertisement() {

	}

	public Advertisement(String title, User user) {
		this.title = title;
		this.user = user;
	}

	public Advertisement(City city, String numberOfRooms, String numberOfHalls, User user, BigDecimal price) {
		this.city = city;
		this.numberOfRooms = numberOfRooms;
		this.numberOfHalls = numberOfHalls;
		this.user = user;
		this.price = price;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public HomeType getHomeType() {
		return homeType;
	}

	public void setHomeType(HomeType homeType) {
		this.homeType = homeType;
	}

	public String getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(String numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getNumberOfHalls() {
		return numberOfHalls;
	}

	public void setNumberOfHalls(String numberOfHalls) {
		this.numberOfHalls = numberOfHalls;
	}

	public String getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(String squareMeters) {
		this.squareMeters = squareMeters;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public AdvertisementType getAdvertisementType() {
		return advertisementType;
	}

	public void setAdvertisementType(AdvertisementType advertisementType) {
		this.advertisementType = advertisementType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String[] getPhotoList() {
		return photoList;
	}

	public void setPhotoList(String[] photoList) {
		this.photoList = photoList;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}
}