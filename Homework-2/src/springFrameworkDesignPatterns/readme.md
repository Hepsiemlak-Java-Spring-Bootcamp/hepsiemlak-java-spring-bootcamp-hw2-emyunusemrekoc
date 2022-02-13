# Spring Framework’de Kullanılan Design Patternlar

##Factory Method:
BeanFactory bu pattern üzerine bina edilmiştir. Spring managed beanların yaratılması ve bağımlılıkların sağlanmasında kullanılır.
## Singleton:
Yaratılan bean’ler default olarak container genelinde tek bir instance’a sahip olmaktadırlar. Spring’in Singleton implemantasyonu GOF Singleton pattern’ından scope olarak biraz daha farklıdır.
## Prototype:
İstendiği takdirde ApplicationContext herhangi bir bean tanımından her getBean(‘beanName’) ile erişimde yeni bir instance yaratmaktadır. Bean tanımı burada tam bir prototype örüntüsüdür.
## Proxy:
Spring Application Framework’ün en çok faydalandığı pattern diyebiliriz. Scoped bean oluşturmada, Spring AOP kabiliyetinin sunulmasında, TX kabiliyetinin implemantasyonunda hep bu pattern kullanılmaktadır.
## Template Method:
Spring’in veri erişim altyapısı bu pattern üzerine kuruldur. JdbcTemplate, HibernateTemplate, JpaTemplate, RestTemplate…
## Observer:
ApplicationContext’in event yönetimi tam bir publish subscribe örneğidir. ApplicationContext bir event medium rolündedir. Bir grup spring managed bean ApplicationContext vasıtası ile ApplicationListener tipindeki diğer bir grup bean’lere event notifikasyonunda bulunabilirler.
## Mediator:
Bir önceki pattern’da ApplicationContext’in event medium rolünde olduğunu söylemiştik. Bu sayede birbirleri ile haberleşmek isteyen bean’lar loosely coupled halde kalabilmektedirler. Sadece bildikleri ApplicationContext’in kendisidir, yani mediator.
## Front Controller:
Spring MVC Framework’ün iskeletini oluşturan DispatcherServlet bu pattern’ın bire bir karşılığıdır.