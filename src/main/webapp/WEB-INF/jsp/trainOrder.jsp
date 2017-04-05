<%@ include file="IncludeTop.jsp" %>


<form method=POST action="http://localhost:8080/carnumberJSP2/view/trainOrder.do">
	<p>train_number:
	  <select name="trainNumber" size=1>
	     <c:forEach var="myTrainNumber" items="${myModel2.trainNumberList}">
	        <option value=<c:out value="${myTrainNumber}" />>
	            <c:out value="${myTrainNumber}" />
	        </option>
      </c:forEach>
      </select>

	  <input name="submit" type=submit value="  search  " />	
  </p>
</form>
	<tr>
	<tr>
<center>	
	<table border>

		
		<tr>
		<th>序号</th>
		<th>车号</th>
		<th>车型</th>
		<th>标重</th>
		<th>自重</th>
		<th>到达时间</th>

		</tr>

		<c:forEach var="myData" items="${myModel2.carList}">
			<tr>
			<td>
				<c:out value="${myData.seriaryNumber}" />
			</td>
			<td>
				<c:out value="${myData.carNumber}" />
			</td>
			<td>
				<c:out value="${myData.carMarque}" />
			</td>
			<td>
				<c:out value="${myData.carryWeight1}" />
			</td>	
			<td>
				<c:out value="${myData.selfWeight1}" />
			</td>
			<td>
				<c:out value="${myData.pastTime}" />
			</td>												
			</tr>
		</c:forEach>
	</table>
</center>




<%@ include file="IncludeBanner.jsp" %>

<%@ include file="IncludeBottom.jsp" %>
