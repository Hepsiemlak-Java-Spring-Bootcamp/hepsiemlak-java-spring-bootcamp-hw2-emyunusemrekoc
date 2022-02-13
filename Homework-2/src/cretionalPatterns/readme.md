# Creational Patterns

Yaratımsal kalıplar, uygulamanın çalışma süreci içerisinde oluşturulması gereken nesneler ve bu nesnelerin belli yapılar dahilinde oluşturulmasını öngören beş farklı şablondan (desen) oluşur.

- Factory Method
- Abstract Factory Pattern
- Singleton Design Pattern
- Builder Design Pattern
- Prototype Design Pattern

Üretimle ilgili tasarımlarda önem kazanmaktadır. Fabrika ve ürün grubu gibi ilişkiler  bir kez tanımlanır. Bu tasarımda önemli olan yapısal olarak birbirine  benzeyen ürünlerin ortak bir ara katman üzerinden yönetilebilmesini sağlamaktır. Bu şekilde kurulan yapı daha kolay ve esnek olur. Tek ara yüz kullanarak bir nesne ailesinin farklı platformlarda yaratılmasına olanak sağlar. Diğer bir deyişle, uygulama davranış değişikliğine uğramadan  farklı platformlara taşınabilir.

## Factory Method

Kelime anlamı “Fabrika Metodu” olan Factory Method, üst sınıfta nesneler oluşturmak için bir arabirim sağlayan, ancak alt sınıfların oluşturulacak bu nesne türünü değiştirmesine izin veren bir yaratımsal desen (creational pattern) türüdür.

## Abstact Factory

Türkçe’ye birebir çevirinde soyut fabrika gibi anlamsız bir ifadeye dönüşen Abstract Factory birbiri ile ilişki classları (sınıf), methodların içeriğini belirlemeden oluşturmayı sağlıyor.

## Singleton

Nesnenin sadece bir defa oluşturulmasını öngören bir mekanizma kurulmak istenildiğinde etkin bir biçimde kullanılabilen bir tasarım desenidir. Oluşturulan bir sınıftan sadece bir nesne yaratılacak şekilde bir kısıtlama yapabilme olanağı sağlar ve nesneye ilk kez ihtiyaç duyulana kadar yaratılmayabilir.

##Builder

Builder karmaşık nesnelerin adım adım oluşturulduğu yaratımsal bir tasarım desenidir. Bu desen aynı kurucu kod ile farklı tür ve gösterimdeki nesneleri oluşturmanıza olanak sağlar. Türkçe karlılığı kurucu, inşaatçı vb. tanımlardır.

## Prototype

Kendi üzerinden yaratılacak nesneler için prototip görevi üstlenen bir yapı sunmaktadır. Diğer bir deyişle, sınıflardan nesne yaratırken yeni nesnelerin baştan yaratılmayıp, mevcutlarını örnek kabul ederek yaratılmasını sağlar. Bu desen sayesinde nesneler, kaynaklar gereksiz yere meşgul edilmeden yaratılırlar.

