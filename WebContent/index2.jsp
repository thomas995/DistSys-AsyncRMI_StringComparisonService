<%@ include file="includes//header.jsp"%>

<div class="animated bounceInDown" style="font-size:48pt; font-family:arial; color:#990000; font-weight:bold">String Comparison Service</div>
<%
  //mock processing
  for(int x = 0; x < 3; x++)
  {						
                         out.print("<br/>Processing!");
                         out.flush();
                         Thread.sleep(2000);
  }                        

%>
<br/>Finished processing. Your result has been outputted below...
</p>&nbsp;</p>&nbsp;</p>

<table width="600" cellspacing="0" cellpadding="7" border="0">
	<tr>
		<td valign="top">

			<form bgcolor="white" method="POST" action="index2.jsp">
				<fieldset>
					<legend><h3>Specify Details</h3></legend>
				
					<b>Select Algorithm:</b>
						
					<select name="cmbAlgorithm">
						<option>Damerau-Levenshtein Distance</option>
						<option>Euclidean Distance</option>
						<option>Hamming Distance</option>
						<option>Hirschberg's Algorithm</option>
						<option>Jaroa Winkler Distance</option>
						<option selected>Levenshtein Distance</option>
						<option>Needleman-Wunsch</option>
						<option>Smith Waterman</option>
					</select>	
					<p/>

					<b>Enter String <i>s</i> :</b><br>
					<textarea name="txtS" rows="5" cols="100"  wrap="soft"></textarea>	
					<p/>

					<b>Enter String <i>t</i> :</b><br>
					<textarea name="txtT" rows="5" cols="100"  wrap="soft"></textarea>	
					<p/>

					<center><input type="submit" value="Compare"></center>
				</fieldset>							
			</form>	

		</td>
	</tr>
</table>
<%@ include file="includes//header.jsp" %>

