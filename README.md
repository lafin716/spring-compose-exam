# Spring & MySQL docker-compose 구성 예제
> 스프링과 MySQL을 도커로 빌드하고 한번에 관리 할 수 있게 컴포즈로 설정한다

# 사용법
```
// 먼저 스프링부트 프로젝트를 jar로 패키징
./gradlew bootJar

// 컴포즈 명령으로 도커 이미지를 빌드 후에 컨테이너로 일괄 실행
docker-compose up --build
```

# 회고
- 도커파일 명령어는 비슷한게 있으나 쓰임새는 다르다
  - COPY != ADD
  - ENTRYPOINT != CMD
- DB 서버와 웹서버 둘 다 도커 컨테이너로 올라가는 경우 네트워크 설정이 필요함
  - 각 컨테이너별로 IP 를 새로 할당 받기 때문에 localhost는 동작하지 않음
  - 컨테이너 이름을 지정하여 생성 후 웹서버의 DB URL에 컨테이너 이름을 설정하면 컨테이너 간 통신 가능