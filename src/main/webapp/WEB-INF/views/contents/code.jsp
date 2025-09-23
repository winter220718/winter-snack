<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>코드 변경 해보는 페이지</title>
    <table>
        <thead>
        <tr>
            <th>시퀀스</th>
            <th>코드ID</th>
            <th>코드설명</th>
            <th>코드값</th>
            <th>코드명</th>
            <th>정렬순서</th>
            <th>사용여부</th>
            <th>수정</th>
            <th>삭제</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${code}" varStatus="status">
            <tr id="row-${item.codeSeq}">
                <td>${item.codeSeq}</td>
                <td>${item.codeId}</td>
                <td>${item.codeDc}</td>
                <td>${item.codeValue}</td>
                <td>${item.codeNm}</td>
                <td>${item.sortOrd}</td>
                <td>${item.useYn}</td>
                <td><button class="modify-btn">수정</button></td>
                <td><button onclick="codeDelete(${item.codeId})">삭제</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <h2>입력하기</h2>
    <form action="${pageContext.request.contextPath}/code/insert" method="post">
        <table>
            <tr>
                <th>코드 ID</th>
                <td><input type="text" name="codeId" /></td>
            </tr>
            <tr>
                <th>코드 설명</th>
                <td><input type="text" name="codeDc" /></td>
            </tr>
            <tr>
                <th>코드 값</th>
                <td><input type="text" name="codeValue" /></td>
            </tr>
            <tr>
                <th>코드명</th>
                <td><input type="text" name="codeNm" /></td>
            </tr>
            <tr>
                <th>정렬 순서</th>
                <td><input type="number" name="sortOrd" /></td>
            </tr>
            <tr>
                <th>사용 여부</th>
                <td>
                    <select name="useYn">
                        <option value="Y">사용</option>
                        <option value="N">미사용</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">저장</button>
                </td>
            </tr>
        </table>
    </form>

    <a href="/">홈으로</a>



</head>
<body>

</body>
<script src="${pageContext.request.contextPath}/static/assets/js/cmm/util.js"></script>
<script src="${pageContext.request.contextPath}/static/assets/js/code/code.js"></script>
</html>
