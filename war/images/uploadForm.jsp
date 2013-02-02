<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>

<!DOCTYPE>

<meta charset="utf-8">
<title>Images Service</title>

<form action="upload" method="post" enctype="multipart/form-data">
  <p><input type="file" name="imageFile"></p>
  <p>リサイズ: <input type="text" name="resize"></p>
  <p><input type="submit" value="変換"></p>
</form>