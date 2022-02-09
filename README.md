# spring cloud와 MSA를 이용하여 만든 도서관리 시스템

### system architecture
![IMG_KEEP_1616388527](https://user-images.githubusercontent.com/40568894/114393145-a9425200-9bd4-11eb-8e2b-3715fb05fa55.jpg)

# 소스코드 분석내용(02월 09일(수))
## 1. 개발환경 동기화
### 1) JDK8 버전으로 동기화필요<br/>
![스크린샷(1)](https://user-images.githubusercontent.com/84068193/153155063-65335df4-36f0-4e16-824c-e0315344ec49.png)<br/>
### 2) 프로젝트 내부설정도 동기화 진행<br/>
![image](https://user-images.githubusercontent.com/84068193/153155374-e865f812-bb2c-45d4-b285-a36014bd9b7e.png)
### 3) zookipper 서버 구축
![image](https://user-images.githubusercontent.com/84068193/153156447-ca5be7a6-f221-4ac2-b3cf-0f84b81cdcd1.png)
### 4) kafka 서버 구축
![image](https://user-images.githubusercontent.com/84068193/153156390-a73dec72-e158-4c92-86dd-8424ee62f73a.png)
### 5) 모든 API 서버 실행시 Eureka 접근 확인
![image](https://user-images.githubusercontent.com/84068193/153156580-c014e532-1247-461d-a86b-7935f47f3495.png)


## 2. book-request-service 내부 네이버 검색 API 설정 초기화<br/>
![image](https://user-images.githubusercontent.com/84068193/153155763-3e0469e7-87a8-409d-aa93-5113546902ac.png)<br/>

## 3. 각 API의 datasource 연결 확인(실패)
### 1) H2 DB활용 테스트 확인
![image](https://user-images.githubusercontent.com/84068193/153156913-dc8f0cfa-732a-493c-9c93-caadbea092fb.png)
테이블이 자동생성되는 것은 확인되나 실제 DB쿼리문 확인시 테이블은 물론 DATABASE까지 존재하는지를 모르겠음..
![image](https://user-images.githubusercontent.com/84068193/153158928-6cafeb42-9237-451c-a3fb-ab8763b439b8.png)<br/>
postman 활용 소스코드 내에 지정된 파라미터를 넣어도 확인이 되지않음..
### 2) mysql로 설정하여 확인하려 하였으나 jdbc가 무조건 h2로 연결되는 문제가 있음. 해결하지 못함...
