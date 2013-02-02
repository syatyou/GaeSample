<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<!DOCTYPE html>

<meta charset="utf-8">
<title>images Service</title>

<p>ファイル名: ${f:h(imageFile.fileName)}</p>
<p>リサイズ: ${f:h(resize)}%</p>
<p><img src="/images/get?id=${imageFile.key.id}"></p>