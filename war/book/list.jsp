<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>


<meta charset="utf-8">
<title>書籍管理アプリ</title>
<style>
#users {
  border-collapse: collapse;
}
th,td {
  padding: 5px;
  border: solid 1px #999;
}
.number {
  text-align: right;
}
</style>

<c:if test="${empty users}">
<p>書籍一覧</p>
</c:if>

<c:if test="${not empty users}">
<table id="users">
  <tr>
    <th>タイトル</th>
    <th>著者名</th>
    <th>価格</th>
  </tr>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${f:h(user.title)}</td>
      <td>${f:h(user.author)}</td>
      <td>${f:h(user.price)}</td>
    </tr>
  </c:forEach>
</table>
</c:if>