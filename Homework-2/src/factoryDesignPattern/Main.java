package factoryDesignPattern;

import factoryDesignPattern.factories.*;
import factoryDesignPattern.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {

		//Factory Method
		IUser user20 = UserFactory.createUser("IndividualUser");



		//Factory Method, newInstance() ile:
		IMessage message1 = MessageFactory.createMessage(Message.class);
		IAdvert advert1 = AdvertFactory.createAdvert(Advertisement.class);


		IndividualUser user1 = new IndividualUser();
		user1.setFirstName("Ayse");
		user1.setLastName("Sari");
		user1.setEmail("ayse.sari@gmail.com");
		user1.setMessageBox(prepareMessageBox());





		IndividualUser user2 = new IndividualUser();
		user2.setFirstName("Ahmet");
		user2.setLastName("Karan");
		user2.setEmail("ahmet.karan@gmail.com");
		user2.setMessageBox(prepareMessageBox());

		IndividualUser user3 = new IndividualUser();
		user3.setFirstName("Salim");
		user3.setLastName("Öztürk");
		user3.setEmail("salimozturk@gmail.com");
		user3.setMessageBox(prepareMessageBox());

		IndividualUser user4 = new IndividualUser();
		user4.setFirstName("Haydar");
		user4.setLastName("Halim");
		user4.setEmail("haydarhalim@gmail.com");
		user4.setMessageBox(prepareMessageBox());

		IndividualUser user5 = new IndividualUser();
		user5.setFirstName("Meltem");
		user5.setLastName("Seren");
		user5.setEmail("meltemseren@gmail.com");
		user5.setMessageBox(prepareMessageBox());



		List<Message> user1Messagebox= user1.getMessageBox();
		user1Messagebox.add(new Message("Başlık1","merhaba",user1,user2));
		user1Messagebox.add(new Message("Başlık2","merhaba",user1,user3));
		user1Messagebox.add(new Message("Başlık3","merhaba",user1,user4));

		List<Message> user2Messagebox= user2.getMessageBox();
		user2Messagebox.add(new Message("Başlık4","merhaba",user2,user5));
		user2Messagebox.add(new Message("Başlık5","merhaba",user2,user3));
		user2Messagebox.add(new Message("Başlık6","merhaba",user2,user4));

		List<Message> user3Messagebox= user3.getMessageBox();
		user3Messagebox.add(new Message("Başlık7","merhaba",user3,user2));
		user3Messagebox.add(new Message("Başlık8","merhaba",user3,user1));
		user3Messagebox.add(new Message("Başlık9","merhaba",user3,user4));

		List<Message> user4Messagebox= user4.getMessageBox();
		user4Messagebox.add(new Message("Başlık10","merhaba",user4,user2));
		user4Messagebox.add(new Message("Başlık11","merhaba",user4,user3));
		user4Messagebox.add(new Message("Başlık12","merhaba",user4,user5));

		List<Message> user5Messagebox= user5.getMessageBox();
		user5Messagebox.add(new Message("Başlık13","merhaba",user5,user1));
		user5Messagebox.add(new Message("Başlık14","merhaba",user5,user3));
		user5Messagebox.add(new Message("Başlık15","merhaba",user5,user4));



		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);


		City istanbul = new City("istanbul");
		City izmir = new City("izmir");
		City ankara = new City("ankara");
		City manisa = new City("manisa");
		City adana = new City("adana");



		List<Advertisement> advertisementList2 = new ArrayList<>();
		advertisementList2.add(prepareIlan(istanbul,"Sahibinden Acil kiralık","2","1",new BigDecimal(500), user2));
		advertisementList2.add(prepareIlan(istanbul,"Temiz ev","2","1",new BigDecimal(5000), user2));
		advertisementList2.add(prepareIlan(istanbul,"kirası uygun","4","1",new BigDecimal(2500), user2));
		advertisementList2.add(prepareIlan(istanbul,"metroya yakın","3","1",new BigDecimal(500), user3));
		advertisementList2.add(prepareIlan(istanbul,"Ahsen konuttan kiralık","3","1",new BigDecimal(1700), user3));
		advertisementList2.add(prepareIlan(istanbul,"Doktordan kiralık","3","1",new BigDecimal(1100), user3));
		advertisementList2.add(prepareIlan(istanbul,"ara kat","2","1",new BigDecimal(750), user3));
		advertisementList2.add(prepareIlan(istanbul,"avmye 500 metre","2","1",new BigDecimal(3200), user4));
		advertisementList2.add(prepareIlan(istanbul,"memura kiralık","2","1",new BigDecimal(2400), user4));
		advertisementList2.add(prepareIlan(istanbul,"doğalgazlı","3","1",new BigDecimal(4000), user5));
		advertisementList2.add(prepareIlan(izmir,"öğrenciye","3","1",new BigDecimal(1500), user5));
		advertisementList2.add(prepareIlan(adana,"öğrenciye","3","1",new BigDecimal(1500), user5));
		advertisementList2.add(prepareIlan(manisa,"öğrenciye","2","1",new BigDecimal(1500), user5));
		advertisementList2.add(prepareIlan(ankara,"öğrenciye","2","1",new BigDecimal(1500), user5));
		advertisementList2.add(prepareIlan(ankara,"öğrenciye","3","1",new BigDecimal(1500), user5));



		Set<Advertisement> user1FavouriteAdvertisements= new HashSet<>();
		user1FavouriteAdvertisements.add(advertisementList2.get(1));
		user1FavouriteAdvertisements.add(advertisementList2.get(3));
		user1FavouriteAdvertisements.add(advertisementList2.get(4));
		user1FavouriteAdvertisements.add(advertisementList2.get(2));

		user1.setFavouriteAdvertisements(user1FavouriteAdvertisements);

		Set<Advertisement> user2FavouriteAdvertisements= new HashSet<>();
		user2FavouriteAdvertisements.add(advertisementList2.get(0));
		user2FavouriteAdvertisements.add(advertisementList2.get(5));
		user2FavouriteAdvertisements.add(advertisementList2.get(6));
		user2FavouriteAdvertisements.add(advertisementList2.get(7));

		user2.setFavouriteAdvertisements(user2FavouriteAdvertisements);

		Set<Advertisement> user3FavouriteAdvertisements= new HashSet<>();
		user3FavouriteAdvertisements.add(advertisementList2.get(8));
		user3FavouriteAdvertisements.add(advertisementList2.get(9));
		user3FavouriteAdvertisements.add(advertisementList2.get(10));
		user3FavouriteAdvertisements.add(advertisementList2.get(11));

		user3.setFavouriteAdvertisements(user3FavouriteAdvertisements);



		//Tüm mesajların başlıklarını ve kullanıclarını getirir
		getAllMessageOfUsers(userList);

		//girilen parametrelere göre arama yapar
		searchAdvertisementByCityAndNumberOfRoomsAndPrice(advertisementList2,istanbul,"2","1",new BigDecimal(3000));
		searchAdvertisementByCityAndNumberOfRoomsAndPrice(advertisementList2,istanbul,"3","1",new BigDecimal(3000));

		//girilen maile göre kullanıcıyı bulur, favori ilanlarını listeler
		makeFavouriteAdvertisements(userList,"ayse.sari@gmail.com");
		makeFavouriteAdvertisements(userList,"ahmet.karan@gmail.com");

	}


	private static void makeFavouriteAdvertisements(List<User> userList,String mail){

		for (User users:userList) {

			if(users.getEmail().equals(mail) && users instanceof IndividualUser){

				System.out.println("\n"+((IndividualUser) users).getEmail()+" Mail adresine sahip kullanıcının favori ilanları :");

				for (Advertisement favouriteAdvertisements:((IndividualUser) users).getFavouriteAdvertisements()) {


					System.out.println("\n*********************");
					System.out.println( " Ilan adı : "+favouriteAdvertisements.getTitle()+"\n Şehir :"+favouriteAdvertisements.getCity().getCity()+" Oda sayısı: "+favouriteAdvertisements.getNumberOfRooms()+" Salon sayısı: "+ favouriteAdvertisements.getNumberOfHalls()+" Fiyatı : "+favouriteAdvertisements.getPrice().intValue());
				}


			}

		}

	}


	private static List<Message> prepareMessageBox() {
		List<Message> messageBox = new ArrayList<>();
		return messageBox;
	}


	private static Advertisement prepareIlan(City city,String title,String numberOfRooms,String numberOfHalls,BigDecimal price, User user) {
		Advertisement advertisement = new Advertisement();
		advertisement.setTitle(title);

		//kullanici.mesajKutusu.add(new Mesaj("acil dönüş")); // NPE

		advertisement.setCity(city);
		advertisement.setPrice(price);
		advertisement.setUser(user);
		advertisement.setNumberOfHalls(numberOfHalls);
		advertisement.setNumberOfRooms(numberOfRooms);

		advertisement.setActive(true);

		advertisement.setPhotoList(makeResimList());


		return advertisement;
	}


	private static String[] makeResimList() {
		String[] resimList = new String[5];
		resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return resimList;
	}


	//oda salon banyo ayrı ayrı yaz (oda,salon,banyo) salona odaya ve fiyata göre getir
	private static void searchAdvertisementByCityAndNumberOfRoomsAndPrice(List<Advertisement> advertisementList,City city, String numberOfRooms , String numberOfHalls ,BigDecimal price){


		for (Advertisement advertisements:advertisementList) {

			if(advertisements.getCity().getCity().equals(city.getCity()) && advertisements.getNumberOfRooms().equals(numberOfRooms)
					&& advertisements.getNumberOfHalls().equals(numberOfHalls) && advertisements.getPrice().intValue() < price.intValue()){
				System.out.println("\n*********************");
				System.out.println( " Ilan adı : "+advertisements.getTitle()+"\n Şehir :"+advertisements.getCity().getCity()+" Oda sayısı: "+advertisements.getNumberOfRooms()+" Salon sayısı: "+ advertisements.getNumberOfHalls()+" Fiyatı : "+advertisements.getPrice().intValue());

			}

		}
	}


	private static void getAllMessageOfUsers(List<User> userList){


		for (User users: userList) {

			for (Message message : users.getMessageBox()) {
				String name1 ="";
				String companyName1="";
				String name2 ="";
				String companyName2="";

				if(message.getSender() instanceof CorporateUser){
					companyName1 =((CorporateUser) message.getSender()).getCompanyName();

				}else if(message.getSender() instanceof IndividualUser){
					name1 = ((IndividualUser) message.getSender()).getFirstName();
				}

				if(message.getReceiver() instanceof CorporateUser){
					companyName2 =((CorporateUser) message.getReceiver()).getCompanyName();

				}else if(message.getReceiver() instanceof IndividualUser){
					name2 = ((IndividualUser) message.getReceiver()).getFirstName();
				}
				System.out.println("****************\n"+"Mesaj Başlığı : "+message.getTitle());
				System.out.println("Mesaj içeriği : "+message.getMessage());
				System.out.println("Gönderen : "+ name1+companyName1);
				System.out.println("Alıcı : " + name2+companyName2);

			}
		}


	}


}
