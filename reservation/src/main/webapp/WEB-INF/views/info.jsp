<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html; charset=utf-8"%>
<%@ page session="false"%>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<%@ include file="header.jsp"%>
<link href="${path}/css/info.css?ver=2" rel="stylesheet">
</head>
<body>
<!-- Header -->
			<header id="header">
				<div class="logo"><a href="#">ABOUT US<span>dori hotel</span></a></div>
			</header>

			
		<!-- Main 1 -->
			<section id="main">
				<div class="inner">
				<!-- One -->
					<section id="one" class="wrapper style1">

						<div class="image fit flush">
							<img src="http://putribany.files.wordpress.com/2014/02/seoul-night.jpg" />
						</div>
						<header class="special">
							<h2>DORI SEOUL</h2>
							<p>서울 심장부의 우아하고 스타일리시한 매력</p>
						</header>
						<div class="content">
							<p>역사적인 왕궁 유적들 사이 유리와 철조로 지어진 건축물을 품은 서울은 전통적인 느낌이 물씬한 동시에 미래 지향적인 감각이 가득한 역동적인 도시입니다. 바닥에서 천장까지 통유리가 설치된 객실에서 밖을 내다보면, 서울의 역동적인 풍경이 한눈에 펼쳐집니다.</p>
							<p>도심 속 스파에서 완벽한 고요와 평화를 만끽하시고 사계절 운영되는 수영장에서 휴식을 취하신 다음, 미쉐린 스타를 획득한 쉐프의 요리를 맛보세요. 최고급 칵테일로 유명한 바로 오시면, 흥미로운 스토리의 특별한 칵테일을 즐기실 수 있습니다.</p>
						</div>
					</section>
					
				<!-- Main 2 -->
					<section id="three" class="wrapper">
						<div class="spotlight">
							<div class="image flush"><img src="img/hotel1.jpg"/></div>
							<div class="inner">
								<h3>편안한 객실</h3>
								<p>한눈에 들어오는 서울의 전경으로 황홀한 첫인상을 선사하는 객실입니다. 
								아름다운 서울을 내려다 보며, 여유로운 거실 공간에서 비즈니스 미팅을 가진 다음, 맞춤형 침대를 갖춘 침실과 스파 수준의 욕조가 포함된 욕실에서 편안한 휴식을 만끽해 보세요.
								또한,저희 호텔은 어린이 손님 객실요금을 받지않습니다. 가족친화적인 객실에서 행복한 시간 보내시길 바랍니다.</p>
							</div>
						</div>
						
						<div class="spotlight alt">
							<div class="image flush"><img src="img/hotel2.jpg"/></div>
							<div  class="inner">
								<h3>다이닝 레스토랑 & 바</h3>
								<p>아늑한 소파에 기대어 앉아 활기찬 도심의 거리를 감상할 수 있는 라운지부터 
								세련된 멋과 친근한 분위기가 공존하는 이탈리아 와인 바, 인터네셔널 요리까지 다양한 즐거움을 만끽해 보세요.</p>
							</div>
						</div>

						<div class="spotlight">
							<div class="image flush"><img src="img/hotel3.jpg"/></div>
							<div class="inner">
								<h3>더 스파</h3>
								<p>자연광이 가득한 미니멀한 공간안에서 도심 속 휴식을 느껴보세요. 
								호텔 내에 위치한 스파에서 기운을 복돋우는 트리트먼를 받으며 평온한 시간을 만끽하세요. 전통적인 힐링 테크닉과 모던 테라피가 결합된 트리트먼트는 심신의 균형을 되찾고 새로운 기운을 충전해 드립니다.
								바쁜 일상에 잊고 있던 평온한 여유를 스파에서 회복하세요.</p>
							</div>
						</div>
					</section>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
					</ul>
				</div>
				
				<div class="copyright">
					&copy; Images <a href="https://www.fourseasons.com"> FourSeasons </a> Design <a href="file:///Users/young/Desktop/templated-caminar/index.html"> TEMPLATED</a>
				</div>
			</footer>
	</body>
</html>