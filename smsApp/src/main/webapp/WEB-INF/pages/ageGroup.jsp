<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Group
</h1>

<c:url var="addAction" value="/ageGroup/add" ></c:url>

<form:form action="${addAction}" commandName="/ageGroup">
<table>
	<c:if test="${!empty ageGroup.groupName}">
	<tr>
		<td>
			<form:label path="groupId">
				<spring:message text="groupId"/>
			</form:label>
		</td>
		<td>
			<form:input path="groupId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="groupId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="groupName">
				<spring:message text="groupName"/>
			</form:label>
		</td>
		<td>
			<form:input path="groupName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="upperAgeLimit">
				<spring:message text="upperAgeLimit"/>
			</form:label>
		</td>
		<td>
			<form:input path="upperAgeLimit" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="lowerAgeLimit">
				<spring:message text="lowerAgeLimit"/>
			</form:label>
		</td>
		<td>
			<form:input path="lowerAgeLimit" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty ageGroup.groupName}">
				<input type="submit"
					value="<spring:message text="Edit Group"/>" />
			</c:if>
			<c:if test="${empty ageGroup.groupName}">
				<input type="submit"
					value="<spring:message text="Add Group"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Persons List</h3>
<c:if test="${!empty listPersons}">
	<table class="tg">
	<tr>
		<th width="80">Age Group ID</th>
		<th width="120">Group Name</th>
		<th width="120">Upper Age Limit</th>
		<th width="120">Lower Age Limit</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listGroups}" var="ageGroup">
		<tr>
			<td>${ageGroup.groupId}</td>
			<td>${ageGroup.groupName}</td>
			<td>${ageGroup.upperAgeLimit}</td>
			<td>${ageGroup.lowerAgeLimit}</td>
			<td><a href="<c:url value='/edit/${ageGroup.groupName}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${ageGroup.groupName}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
