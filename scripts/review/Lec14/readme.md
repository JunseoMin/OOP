# 제네릭
- 하나의 코드를 다양한 타입의 객체에 재사용 하는 객체 지향 기법
- 클래스, 인터페이스, 메서드 정의시 타입을 변수로 사용
- Java collection framework에서 주로 사용 (queue, stack ... )
- templete 같은 역할을 함
   
### 장점
- 런타임 오류 사전 방지
- 불필요한 타입 변환 방지
--------
### 주의사항
재네릭 클래스는 각 타입 인자별 개별 버전 생성되지 않음    
제네릭 인자로 기초 타입은 불가능함 - 클래스 타입만 사용 가능
```java
 Gen<int> intOb = new Gen<int>(33); // compile error!! - 기초타입 불가능 
```

제네릭 클래스 참조변수는 타입 인작 같아야만 호환됨
```java
Gen<Integer> iOb;
Gen<String> sOb = new Gen<String>("can't with string")
iOb = sOb; // compile error 타입 호환 불가능 (Integer - String)
```

----
## Object VS Generic (NonGenDemo)
- 제네릭 대신 Object class 를 사용하면 안되나?
- type safety가 보장되지 않음
    > 컴파일 타임에 Object 참조변수가 어떤 타입일지 알 수 없음 > 런타임 에러 발생 
 
