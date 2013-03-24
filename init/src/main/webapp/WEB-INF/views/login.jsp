<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div id="login-form-wrap">
    <h1 >Init login form </h1>
    <form id="login-form" action="<spring:url value="/j_spring_security_check"/>" method="POST">
        <label for="loginusername">UserName</label>
        <input type="text" id="loginusername" name="j_username" />
        </br>
        <label for="password">Password</label>
        <input type="password" id="password" name="j_password" />

        <div>
            <button type="submit" class="btn btn-primary pull-left">Submit</button>
        </div>

    </form>
</div>
