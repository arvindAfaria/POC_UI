<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Member</title>
</head>
<body>
	<form action="updateMembers" method="post">
		<pre>
		Id: <input type="text" name="id" /> Member id: <input type="text"
				name="memberId" /> Member name:<input type="text" name="memberName" />
		certified: Yes<input type="radio" name="certified" /> No<input
				type="radio" name="certified" /> <input type="submit"
				value="save record" />
		</pre>
	</form>
</body>
</html>