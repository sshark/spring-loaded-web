<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<form method="post" action="<c:url value="/login.do"/>">
    <div>Login</div>
    <div><input type="text" name="j_username" value="apple"></div>
    <div>Password</div>
    <div><input type="password" name="j_password" value="mint"></div>
    <div><input type="submit" value="Login"></div>
</form>
</body>
</html>