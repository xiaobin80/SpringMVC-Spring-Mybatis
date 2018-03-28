<br>
<c:if test="${userSession.account.bannerOption}">
	<table>
	<tr><td>
			<c:out value="${userSession.account.bannerName}" escapeXml="false"/>
			&nbsp;
	</td></tr>
	</table>
</c:if>
