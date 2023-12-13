스프링 프레임워크의 추상화
====
- 스프링 빈을 추상화 하는 방법
- 구현 클래스를 분리하는 방법
1. DI를 이용하지 않는 방법 (Spring 을 이용하지 않는 방법)
2. DI를 이용하는 방법
----
## 인터페이스를 이용한 추상화 방법
- what 을 정의하는 수단
- 구현하는 class들이 how를 정의함
- 종속성을 직접 주입함

EX) 
DeliveryDetailsPrinter
- Sorter의 기준에 따라 세부적인 구현이 필요해짐 (SorterByAddress, SorterByName)
- interface 이용하여 은닉 및 다형성이 필요함 (```interface Sorter``` 필요)
- 추상화의 원리 달성 필요함
----
## DI를 이용한 방법
- 스테레오 타입 어노테이션을 이용
- 어떤 의존성을 주입할 것인지
  - 인터페이스를 context에 넣어주진 않음
- context가 직접 생성하고, 추가하도록 구현(@Autowired 이용)
- @autowiring을 이용하여 서로의 종속성 설정 -> 생성자에 @Autowired는 생략되어 있음

