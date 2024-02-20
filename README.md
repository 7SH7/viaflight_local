<!DOCTYPE html>
<html>
<head>


<h1>ViaFlight</h1>

<h2>목표</h2>
<ul>
  <li>외부API 사용해보기 -> 연습량이 많을 수록 좋을 듯</li>
  <li>aws 사용해보기 (S3, RDS, E2, ELASTIC BEANSTALK ...)</li>
  <li>로그인 기능 (SPRING Security, jwt, OAuth2.0 모두 적용)</li>
</ul>

<h2>일지</h2>

<h3>※ 2024-02-10 ~ 2024-02-13</h3>

<h4>수행한 작업</h4>
<ul>
  <li>개인적으로 학습하며, 프로젝트에서 SPRING Security, JWT, OAuth2.0(google)을 학습함.</li>
</ul>
<hr>

<h3>※ 2024-02-14 ~ 2024-02-15</h3>

<h4>수행 작업</h4>
<ul>
  <li>기획분이 정한 공항 관련 리서치 및 정보 정리</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li> aws연동 </li>
  <li> 정리한 내용들 SQL문으로 작성</li>
</ul>

<hr>

<h3>※ 2024-02-16</h3>

<h4>수행 작업</h4>
<ul>
  <li>aws에서 ELB 사용하여, RDS 연결(IntelliJ와 연동)</li>
  <li>이전에 찾은 정보(공항 내부 정보) SQL문 작성 완료</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li> 공항 외부 정보 정리 </li>
  <li> 백엔드 코드 작업 시작 </li>
</ul>

<hr>

<h3>※ 2024-02-17</h3>

<h4>수행 작업</h4>
<ul>
  <li> 유저가 입력해준 값 기반, 유저가 사용할 수 있는 공항 내부 시설 선별하기 (JPQL사용) </li>
  <li> 공항 외부 관련 정보 정리 </li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li> 공항 외부 정보 정리 마무리 + SQL문 작성 </li>
  <li> 유저가 입력해준 정보 기반, 공항 외부 활동 추천 </li>
</ul>

<hr>

<h3>※ 2024-02-18</h3>

<h4>수행 작업</h4>
<ul>
  <li> 공항 외부 정보 정리 및 SQL문 작성 완료 </li>
  <li> 여러 공항 외부 정보 중 유저 상황 기반 활동 추천 기능(JPQL 사용)</li> 
  <li> postman으로 제대로 작동하는지 확인 (문제들 수정 완료) </li>
  <li> ◆ 현재 작업 중인 활동 : 카카오 API 받아와서 위도, 경도 반환해주기</li>
</ul>

<h4>예기치 못한 문제</h4>
<ul>
  <li> 이전에 가입만 해둔 aws에서 금액이 청구되고 있음. -> mentor분께 연락하여, 명일 해결 예정</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li>aws 문제 해결</li>
  <li>배포하기 (프론트측으로 정보 보내기 위함)</li>
  <li>S3 사용하여 이미지 URL 뽑아내기</li>
</ul>

<hr>

<h3>※ 2024-02-19</h3>

<h4>수행 작업</h4>
<ul>
  <li>멘토진 확인받기</li>
  <li>kakao map API (국외는 인지 잘 안됨.) -> Google map API로 바꾸기</li>
  <li>명세서 만들기 (어디에 어떤 정보 있고, data명/type은 무엇이고..)</li>
  <li> postman으로 제대로 작동하는지 확인 </li>  
  <li> variable이름 바꾸기 </li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li>구글 map API 가져오기</li>
  <li>S3 사용해서 imageURL 채워넣기기</li>
</ul>

<hr>

<h3>※ 2024-02-20</h3>

<h4>수행 작업</h4>
<ul>
  <li>구글 map API 가져오기 성공 ::> parsing은 차후에 </li>
  <li>S3이미지 처리 코드 + 다 오리기기</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li>구글 map API 가져오기</li>
  <li>S3 사용해서 imageURL 채워넣기기</li>
</ul>

<hr>



<h1>학기 중 이어서 할 기능들</h1>
  <li> OAuth로 구글 로그인   </li>
  <li> 찜하기 기능 </li>
  <li> 채팅 (익명? 실명? → maybe 익명)   </li>

</body>
</html>
