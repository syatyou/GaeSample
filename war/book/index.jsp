<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>


<meta charset="utf-8">
<title>書籍管理システム</title>
<style>
form {
  border: solid 1px #999;
  padding: 0 10px;
}
</style>

<ul>
<c:forEach var="e" items="${f:errors()}">
  <li>${f:h(e)}</li>
</c:forEach>
</ul>

<form action="create">
  <p>登録する書籍の情報を入力してください。</p>
  <p>タイトル: <input type="text" name="title"></p>
  <p>著者名: <input type="text" name="author"></p>
  <p>価格: <input type="text" name="price"></p>
  <p><input type="submit" value="登録する"></p>
  </form>
</form>