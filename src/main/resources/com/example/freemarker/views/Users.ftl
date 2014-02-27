<#-- @ftlvariable name="" type="com.example.free.UsersView" -->
<html>
<body>
<h1>Users</h1>
<div>
    <ul>
    <#list users as user>
        <li>${user.username}</li>
    </#list>
    </ul>
</div>
</body>
</html>