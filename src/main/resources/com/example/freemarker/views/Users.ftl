<#-- @ftlvariable name="" type="com.example.free.UsersView" -->
<#import "Layout.ftl" as layout>
<@layout.layout>
<h1>Users</h1>
<div>
    <ul>
        <#list users as user>
            <li>${user.username}</li>
        </#list>
    </ul>
</div>
</@layout.layout>