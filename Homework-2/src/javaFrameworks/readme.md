#JAVA FRAMEWORKS

![image](https://user-images.githubusercontent.com/81576354/153774436-bd3852fb-a303-43f3-8799-d3e3a96d79e9.png)

## 1. Spring Framework

Spring Framework, Enterprise Java (JEE) için kullanılan güçlü bir hafif uygulama geliştirme çerçevesidir.

Spring Framework'ün temel özellikleri, herhangi bir Java uygulamasının geliştirilmesinde kullanılabilir. Tam bir modüler framework olarak tanımlanır. Bu framework, gerçek zamanlı bir uygulamanın tüm katman uygulamaları için kullanılabilir. Diğer frameworklerden farklı olarak gerçek zamanlı bir uygulamanın belirli bir katmanının geliştirilmesi için de kullanılabilir, ancak Spring ile tüm katmanları geliştirebiliriz.

Kurumsal uygulamalarda Spring ve Spring MVC, Spring Core, Spring Security, Spring ORM vb. tüm modüller kullanılmaktadır.

Şimdi, bu Spring Framework'un nerede kullanıldığını görelim.

#### Kullanım Alanları:

Web uygulaması geliştirme
Özellikleri herhangi bir Java uygulaması oluşturmak için kullanılabilir
Ayrıca Enterprise Java'da (JEE) kullanılır.

#### Avantajlar:

- Bir web sunucusu veya uygulama sunucusu yazılımı kullanmadan tetiklenebilen container sağlar.
- Spring, üretkenliği artıran ve hatayı azaltan JDBC'yi destekler
- J2EE geliştirmenin kullanımını daha kolay hale getirmeyi hedefler.
- Spring, hem XML hem de anotasyon tabanlı yapılandırmayı destekler
- Kodun geriye dönük uyumluluğunu ve test edilebilirliğini sağlar


#### Uygulama geliştirme için Spring Framework'u kullanan büyük şirketler:

- Netflix (Spring Boot)
- Yatra (Spring MVC)
- Amazon
- eBay


## 2. Hibernate
![image](https://user-images.githubusercontent.com/81576354/153774453-86391544-9610-4e10-bc68-6fe4b24f3ff2.png)

Hibernate ORM, Java için kararlı bir nesne-ilişkisel eşleme frameworkudur. Java programlama dili ile ilişkisel veritabanı yönetim sistemleri (RDBMS) arasında daha iyi iletişimi mümkün kılar.

Java gibi nesne yönelimli bir dil ile çalıştığınızda, Paradigma Uyuşmazlığı olarak da adlandırılan Nesne-İlişkisel Empedans Uyuşmazlığı adlı bir sorunla karşılaşırsınız. Bunun nedeni, object-oriented dillerin ve RDBMS'lerin verileri farklı şekilde işlemesidir, bu da ciddi uyumsuzluk sorunlarına yol açabilir. Hibernate, size Java'nın uyumsuzluk sorunlarının üstesinden gelen bir çerçeve sağlar.

#### Kullanım Alanları:

- Object oriented kavramını izleyerek kalıcı sınıflar geliştirmenize olanak tanır.
- Kodda çok küçük değişiklikler kullanarak herhangi bir veritabanıyla iletişim kurmanıza olanak tanır, nesneler ve ilişkisel kelimeler arasındaki boşluğu kapatır.
- Java varlıkları üzerinde veritabanı işlemini gerçekleştirmenizi sağlayan gelişmiş bir ORM çerçevesidir.

#### JDBC Kullanımı:
- `stmt.executeUpdate( "INSERT INTO admin VALUES ('Yunus', 'Emre')");`

#### Hibernate Kullanımı:
- `session.save(admin);`




#### Avantajlar:

Taşınabilirlik, üretkenlik, sürdürülebilirlik
Ücretsiz ve açık kaynak çerçevesi
JDBC API'sinden çok sayıda tekrarlayan kodu kaldırır

#### Uygulama geliştirme için Hibernate Framework'u kullanan büyük şirketler:

- Oracle
- IBM
- DELL
- Accenture


## 3. Struts
![image](https://user-images.githubusercontent.com/81576354/153774460-8166935c-5751-4080-a1fe-44797b2f5375.png)

Bu, Apache Software Foundation (ASF) tarafından sürdürülen başka bir kurumsal düzeyde frameworktur. Bu tam özellikli Java web uygulama frameworku, geliştiricilerin bakımı kolay bir Java uygulaması oluşturmasına olanak tanır.i. İki versiyonu var. Struts 1 ve Struts 2. Struts 2, OpenSymphony ve Struts 1'in webwork çerçevesinin birleşimidir. Ancak, Apache Struts'un yükseltilmiş versiyonu olduğu için tüm şirketler Struts 2'yi kullanmayı tercih ediyor.

#### Kullanım Alanları:
- Struts 2 framework, MVC tabanlı bir web uygulaması geliştirmek için kullanılır.
- Geliştiricilerin MVC mimarisini benimsemelerine yardımcı olmak için Java Servlet API'sini kullanır ve genişletir.

- Bu framework dokümantasyonu, aktif web geliştiricileri için yazılmıştır ve Java web uygulamalarının nasıl oluşturulduğuna dair bir çalışma bilgisi olduğunu varsayar.
- Geliştirme süresini kısaltır ve uygulamanın yönetilebilirliğini kolaylaştırır
- Merkezi Konfigürasyon sunar, yani bilgileri Java programlarına kodlamak yerine birçok Struts değeri XML veya özellik dosyalarında temsil edilir.
- Platformda oluşturulmayan görevleri gerçekleştirmek için Struts'u diğer Java frameworkleri ile entegre edebilirsiniz.

#### Avantajlar:

- Struts 2 framework, MVC tabanlı bir web uygulaması geliştirmek için kullanılır.
- Geliştiricilerin MVC mimarisini benimsemelerine yardımcı olmak için Java Servlet API'sini kullanır ve genişletir.

- Bu framework dokümantasyonu, aktif web geliştiricileri için yazılmıştır ve Java web uygulamalarının nasıl oluşturulduğuna dair bir çalışma bilgisi olduğunu varsayar.
- Geliştirme süresini kısaltır ve uygulamanın yönetilebilirliğini kolaylaştırır
- Merkezi Konfigürasyon sunar, yani bilgileri Java programlarına kodlamak yerine birçok Struts değeri XML veya özellik dosyalarında temsil edilir.
- Platformda oluşturulmayan görevleri gerçekleştirmek için Struts'u diğer Java frameworkleri ile entegre edebilirsiniz.

#### Uygulama geliştirme için Hibernate Framework'u kullanan büyük şirketler:

- Infosys
- Accenture
- NexGen Technologies



## 4.Google Web Toolkit [GWT]
![image](https://user-images.githubusercontent.com/81576354/153774467-800eb7cb-fde1-4ac5-a9e5-18bafde6d04e.png)

Google Web Araç Takımı (GWT), geliştiricilerin istemci tarafı Java kodu yazmasına ve bunu JavaScript olarak oluşturmasına yardımcı olan tamamen ücretsiz, açık kaynaklı bir frameworktur. AdSense, Google Cüzdan ve Blogger gibi birçok Google ürünü GWT kullanılarak yazılmıştır.

Geliştiriciler, GWT'yi kullanarak karmaşık tarayıcı uygulamalarını hızla kolayca kodlayabilir. Ayrıca Java'da Ajax uygulamaları geliştirmenize ve hatalarını ayıklamanıza olanak tanır. GWT'yi kullanmanız için en önemli sebep, JavaScript optimizasyonu veya duyarlı tasarım gibi ön uç teknolojilerde uzman olmadan karmaşık tarayıcı tabanlı uygulamalar yazabilmenizdir.

#### Kullanım Alanları:

- Geliştirici dostu
- Google API'lerinin Kullanımı
- Karmaşık JavaScript ön uç uygulamaları oluşturmaya ve sürdürmeye yardımcı olması

#### Avantajlar:

- Yaygın web geliştirme görevleri için yeniden kullanılabilirliği destekler
- Google API'leri GWT uygulamalarında kullanılabilir
- Uluslararasılaştırma, tarayıcılar arası taşınabilirlik, UI soyutlama, yer imi oluşturma ve geçmiş yönetimi sunar.

## 5.JavaServer Faces [JSF]

![image](https://user-images.githubusercontent.com/81576354/153774468-c7f030dd-04a3-474f-bd89-6471cdda63ae.png)

JavaServer Faces (JSF), Java tabanlı web uygulamaları için kullanıcı arayüzleri oluşturmak için Oracle tarafından geliştirilmiştir. Java Topluluk Süreci (JCP) girişiminin resmi standardıdır. Oldukça stabil bir frameworktur.

Bu, component tabanlı bir UI frameworkudur. JSF, MVC yazılım tasarım modeline dayanmaktadır ve uygulama mantığı ile temsil arasındaki ayrımı tamamen tanımlayan bir mimariye sahiptir.


#### Kullanım Alanları:

- Component tabanlı UI frameworklerde kullanılır
- Yerel uygulamalar oluşturmaya yardımcı olur

#### Avantajlar:

- JSF, Java EE'nin ayrılmaz bir parçasıdır
- Mükemmel araçlar ve zengin kütüphaneler sağlar
- Yeni bir framework sunarak temel uygulamayı değiştirmek zorunda kalmadan mevcut arka uç Java kodunun bir web arayüzü ile genişletilmesine olanak tanır.
- JSF, Java EE'nin bir parçası olan kullanıcılar için geniş kapsamlı kütüphaneler içerir.
