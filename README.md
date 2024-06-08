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

<h2>결과</h2>
<p>한동대학교 멋쟁이사자처럼 대상 수상</p>

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
  <li>S3 사용해서 imageURL 채워넣기기</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li></li>
</ul>

<hr>

<h3>※ 2024-02-21</h3>

<h4>수행 작업</h4>
<ul>
  <li>구글 map API -> parsing은 성공 </li>
  <li>S3이미지 처리 마감.</li>
  <li>DB바꾸기</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li>F.E, D.E 요청 사항 맞춰 DB값 바꾸기.</li>
  <li>likelion github 정리하기기</li>
</ul>

<hr>


<h3>※ 2024-02-23/h3>

<h4>수행 작업</h4>
<ul>
  <li>F.E와 작업하며, 추천 기능 (JPQL)에 논리 문제가 있음을 확인함. -> 일단 수정은 하되, LIKELIONHGU GITHUB에는 PUSH 안 할 듯 </li>
  - (기존 내용 망가지는 거 방지)
  <li>Elastic BeanTalk 삭제함. -> 새롭게 열 것임.</li>
</ul>

<h4>명일 작업</h4>
<ul>
  <li>데모데이..</li>
</ul>

<hr>

<h1>데모데이 결과</h1>

![image](https://github.com/7SH7/viaflight_local/assets/97334714/9d9d5c18-2b32-4f2c-a996-67fffb76db23)

<li>느낀점: 학부/일반인에게는 프론트적인 부분이 많이 중요하다. -> 백엔드 역할은 그닥 부각되지 않는다. </li>

<h1>데모데이 마치고 바뀔 기능들</h1>
<ul>
  <li>LayoverAirport API를 3개의 API로 나눌 것 -> 공항관련 내용, 공항 내부 아이콘 내용, 공항 외부 아이콘 내용</li>
  <li>도착시간  -> localdatetime으로 바꾸기 ::> 이후에 항공권 선택 및 결제 부분까지 하였을 경우, localdatetime이 비교하기에 더 적합할 것으로 판단됨.</li>
  - 지금은 double로 되어 있지만, 해당 기능은 변경 필수적일 예정
  <li>layoverAirportDBFrame에 대한 내용들 (담배터, 환전소 관련 기능) -> 각각 하나의 domain class로 정의해두기.</li>
  <li>도착 기능 ::> localdatetime으로 바꿀 예정 (위에 항공권 예약 관련 기능으로 바꾸려면 필수)</li>
</ul>

<h1>이후에 이어서 할 기능들</h1>
<ul>
  <li> <s> 0. JPQL 수정 (시간 관련 추천 관련 기능) </s> </li>
  <li> 1. SPRING SECURITY, JWT, OAuth 로그인 (구글, KAKAO)   </li>
  <li> 2. 관심사 기반 추천 (처음 관심사/목적 추천받을 예정) + 추천 알고리즘 (유저 구매 내역 비슷한 것 -> 다른 사람들이 구매한 내역으로 추천) </li>
  <li> 3. 채팅 (익명? 실명? 둘 다 무관) ::> KAKAO OPEN CHAT ROOM 느낌   </li>
  <li> 4. Amadeus API 사용하여, 항공권 조회, 결제 or 그냥 경유공항 관련 정보 이용하는 하는 경우에 대한 것만 있는 것 ::> 2개로 나눠서 개발할 듯</li>
  <li> 5. 사용자 참여 기능 늘리기. (리뷰, 찜하기 -> 스크랩기능)</li>
</ul>

</body>
</html>
