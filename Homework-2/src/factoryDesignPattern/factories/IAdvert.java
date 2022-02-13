package factoryDesignPattern.factories;

import factoryDesignPattern.model.*;

import java.math.BigDecimal;
import java.util.Date;

public interface IAdvert {

     City getCity() ;

     void setCity(City city);

     District getDistrict() ;

     void setDistrict(District district) ;

     HomeType getHomeType() ;

     void setHomeType(HomeType homeType);

     String getNumberOfRooms() ;

     void setNumberOfRooms(String numberOfRooms);

     String getNumberOfHalls();

     void setNumberOfHalls(String numberOfHalls);
     String getSquareMeters() ;

     void setSquareMeters(String squareMeters) ;
     String getFloorNumber() ;

     void setFloorNumber(String floorNumber);

     AdvertisementType getAdvertisementType();

     void setAdvertisementType(AdvertisementType advertisementType) ;

     String getTitle() ;

     void setTitle(String title);

     User getUser() ;

     void setUser(User user) ;

     String[] getPhotoList() ;

     void setPhotoList(String[] photoList) ;

     BigDecimal getPrice() ;

     void setPrice(BigDecimal price);

     boolean isTurbo() ;

     void setTurbo(boolean turbo) ;

     Date getCreatedDate() ;

     void setCreatedDate(Date createdDate);

     Date getEndDate();

     void setEndDate(Date endDate);

     boolean isActive();

     void setActive(boolean active) ;
}
