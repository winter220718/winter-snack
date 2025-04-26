<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WINTER SNACK</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <%--    <script src="node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script>--%>
    <script></script>
</head>
<body>
<div class="container" style="margin-top: 50px">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
        <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <span><img src="${pageContext.request.contextPath}/static/assets/images/logo/logo.png" style="max-width: 300px;" alt="logo"></span>
        </a>
        <p>${pageContext.request.contextPath}</p>
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Home</a></li>
            <li class="nav-item"><a href="/" class="nav-link">Features</a></li>
            <li class="nav-item"><a href="/" class="nav-link">Pricing</a></li>
            <li class="nav-item"><a href="/" class="nav-link">FAQs</a></li>
            <li class="nav-item"><a href="/" class="nav-link">About</a></li>
        </ul>
    </header>

    <main>
        <h2>제품 소개</h2>
<%--        <p>여기에 메인 내용을 추가하세요.</p>--%>

        <%-- JSTL 사용 예제 --%>
        <c:if test="${not empty message}">
            <p>메시지: ${message}</p>
        </c:if>

        <p>Java 변수 출력:
        </p>
    </main>
</div>
<div class="container">
<footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <p>&copy; 윈터 스낵...</p>
</footer>
</div>
</body>
</html>
