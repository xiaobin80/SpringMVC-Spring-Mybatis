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
<div style="text-align:center;">
	<table border="1" style="margin: auto;">
		<tr>
		<!-- 序号 -->
		<th>Sn</th>
		<!-- 车号 -->
		<th>Car Number</th>
		<!-- 车型 -->
		<th>Car Marque</th>
		<!-- 标重  -->
		<th>Carry Weight</th>
		<!-- 自重 -->
		<th>Self Weight</th>
		<!-- 到达时间 -->
		<th>Past Time</th>

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
</div>




<%@ include file="IncludeBanner.jsp" %>

<%@ include file="IncludeBottom.jsp" %>
