# WiringBeans
----
- 어떤 빈에서 다른 빈을 참조하는 방법 - has -a 관계 구성
- 빈 간 관계 구성이라 함
- Direct wiring
- Auto wiring
----
## Direct Wiring
- 두 클래스를 Spring Context 에 추가하고 관계를 구성
- projectconfig를 수정하여 직접 관계를 구성함
- config 내의 bean이 이미 호출되어 있다면 다시 호출하지 않고 기존에 생성된 객체가 이용됨
- 두가지의 인스턴스가 생성되는 것이 아님!
- IOC를 만족시키기 위해서 bean메서드의 매개변수로 넣어주는 것이 바람직함
```java
  @Bean
  public Person person() {
    Person p = new Person();
    p.setParrot(parrot());  // 바람직하지 못한 방법 IOC 관점
    p.setName("Ella");
    return p;
  }
```

```java
  @Bean
  public Person person(Parrot parrot) { // 메서드 매개변수를 이용한 방법 IOC가 구현됨
    // context 에서 injection이 일어남
    // 직접 메서드에 넣어주는 것보다 바람직한 방법
    Person p = new Person();
    p.setName("Ella");
    p.setParrot(parrot);
    return p;
  }
```
----
## Auto Wiring
- @Autowired 어노테이션 이용
- 빈에 어노테이션을 마킹하여 관계를 수립
- 스테레오타입 어노테이션(@componentscan, @component)과 함께 사용됨
----
- 인스턴스 변수에 마킹하는 방법: 인스턴스 변수를 final 변수로 사용할 수 없음
```java
  @Autowired  //인스턴스 변수에 마킹하는 방법  -> parrot이라는 빈을 확인하고 넣어줌 IOC
  private Parrot parrot;  // 인스턴스 변수 방법을 이용할 경우 final로 선언할 수 없음
```
- 생성자에 마킹하는 방법
```java
  @Autowired  // 생성자에 마킹하는 방법 => final변수로 인스턴스 변수 선언 가능! 주로 이 방법 사용됨
  public Person(Parrot parrot){
    this.parrot = parrot;
  }
  
```
- Setter에 마킹하는 방법: final키워드 사용 불가, 가독성이 떨어짐
- setParrot메서드 위에 autowired 어노테이션 사용방법
- 권장되지 않음
----
## 순환 종속성
- Autowired 되어있는 생성자들이 서로 has-a 관계를 갖게 될 경우
- 데드락을 발생시킴
- 빈 간에 서로 종속성을 가질 경우
- 컴파일 에러 발생: 에러 문구에서 힌트줌
----
## 여러개의 빈이 존재하는 경우
- 메서드의 매개변수와 빈의 이름이 일치할 때: 매개변수와 같은 이름의 빈을 선택
- 메서드의 매개변수와 빈의 이름이 일치하지 않을 경우
  - @Qualifier 어노테이션을 이용하여 특정 빈을 선택
  - @Primary 어노테이션을 이용하여 마킹된 빈 선택