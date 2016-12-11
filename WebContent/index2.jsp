<%@ include file="includes//header.jsp"%>

<div class="animated bounceInDown" style="font-size:48pt; font-family:arial; color:#990000; font-weight:bold">String Comparison Service</div>
<%
  // waits 3 seconds for each of the "processing"s, acts as a sort of pseudo-asynchonous call
  for(int x = 0; x < 3; x++)
  {						
                         out.print("<br/>Processing!");
                         out.flush();
                         Thread.sleep(3000); // pauses the rest of the program for 3 seconds at a time before showing the rest of the page
  }                        
%>
<br/>
Finished processing. Your result has been outputted below...
</p>&nbsp;</p>&nbsp;</p>
<html>
<head>
<title>Distributed Systems Assignment</title>
</head>
<body>
<H1>Processing request for Job#: 0</H1>
<div id="r"></div>
<font color="#993333">
<b>RMI Server is located at 127.0.0.1<br>Algorithm: Levenshtein Distance<br>String <i>s</i> : G00314495 <br>String <i>t</i> : G00314495 <br>Distance : 1</br>This servlet should only be responsible for handling client request and returning responses. Everything else should be handled by different objects.Note that any variables declared inside this doGet() method are thread safe. Anything defined at a class level is shared between HTTP requests.</b>
</font><P> Next Steps:<OL><LI>Generate a big random number to use a a job number, or just increment a static long variable declared at a class level, e.g. jobNumber.
<LI>Create some type of an object from the request variables and jobNumber.<LI>Add the message request object to a LinkedList or BlockingQueue (the IN-queue)
<LI>Return the jobNumber to the client web browser with a wait interval using <meta http-equiv="refresh" content="10">. The content="10" will wait for 10s.
<LI>Have some process check the LinkedList or BlockingQueue for message requests.
<LI>Poll a message request from the front of the queue and make an RMI call to the String Comparison Service.
<LI>Get the <i>Resultator</i> (a stub that is returned IMMEDIATELY by the remote method) and add it to a Map (the OUT-queue) using the jobNumber as the key and the <i>Resultator</i> as a value.
<LI>Return the result of the string comparison to the client next time a request for the jobNumber is received and the <i>Resultator</i> returns true for the method <i>isComplete().</i></OL><form name="frmRequestDetails"><input name="cmbAlgorithm" type="hidden" value="Levenshtein Distance"><input name="txtS" type="hidden" value=""><input name="txtT" type="hidden" value=""><input name="frmTaskNumber" type="hidden" value="T3">
</form>
</body>
</html>
<script>jobNumber++</script>
<script>var wait=setTimeout("document.frmRequestDetails.submit();", 10000);</script>