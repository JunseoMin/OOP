# LEC 12 File IO
- ------
## I/O (input/output)
- 주변 기기들의 입출력을 의미
- java.io에선 관련 API를 제공함

## streams
- java는 입출력을 스트림을 통해 처리
- FIFO구조
- 추상화의 원리 적용됨
- java io 시스템이 디바이스와 스트림으로 연결되어있음
- 자바 프로그램은 스트림을 통해 정보를 교환함
   
스트림은 사용 전 열고 사용 후 닫아야함  
데이터의 출발지와 목적지를 연결하여 사용, 한번에 열수 있는 개수 제한, 동일한 파일은 둘 이상의 스트림으로 열 수 없음
  
- 스트림은 사용 전 열고, 사용 후 닫아야함

### 바이트스트림, 문자 스트림
- 바이트 스트림: 입출력을 바이너리 데이터로 다룰 때
- 문자 스트림: 입출력을 문자 단위로 다룰 때

### byte stream class
- InputStream, OutputStream 을 이용함
- **void flush** method : 버퍼를 초기화함
- 객체를 생성하여 스트림을 염

### 문자스트림 class
- Reader, Writer이용
- 표준 입출력 스트림: SYSO ... 등의 메서드, 클래스 이용

### 콘솔 입력용 버퍼
- System.in을 BufferedReader와 InputStreamReader로 래핑   

**버퍼**: 입출력 장치간의 동작 속도가 크게 차이날 때 버퍼를 사용하여 효율적으로 관 

