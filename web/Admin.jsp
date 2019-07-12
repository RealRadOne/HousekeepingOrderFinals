<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>The ADMIN</h1>
	<div class="ex">
		<form action="AllocateTask" method="post">
                    <p>Allocate Task<p>
			<table style="with: 50%">
				<tr>
					<td>Task-ID</td>
					<td><input type="text" name="TID" /></td>
				</tr>
                                <tr>
					<td>Worker-ID</td>
					<td><input type="text" name="WID" /></td>
				</tr>
                                 <tr>
					<td>DeadLine</td>
					<td><input type="text" name="DDate" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
           <form action="AddTask" method="post">
               <p>Add Task</p>
			<table style="with: 50%">
				<tr>
					<td>Task-ID</td>
					<td><input type="text" name="TID" /></td>
                                </tr>
                        </table>
               <input type="submit" value="Register" />
           </form>
           <form action="WorkerTask" method="get">
               <p>View Tasks Assigned by WorkerID</p>
			<table style="with: 50%">
				<tr>
					<td>Worker-ID</td>
					<td><input type="text" name="WID" /></td>
				</tr>
                        </table>
                <input type="submit" value="Search" />
           </form>
           <form action="AddWorker" method="post">
               <p>Add Worker</p>
			<table style="with: 50%">
				<tr>
					<td>Worker-ID</td>
					<td><input type="text" name="WID" /></td>
                                </tr>
                        </table>
               <input type="submit" value="Register" />
           </form>
           <form action="AddAsset" method="post">
               <p>Add Asset</p>
			<table style="with: 50%">
                                <tr>
					<td>Name</td>
					<td><input type="text" name="Name" /></td>
				</tr>
				<tr>
					<td>Asset-ID</td>
					<td><input type="text" name="AID" /></td>
				</tr>
                        </table>
               <input type="submit" value="Register" />
           </form>
             <p>View All Assets</p>
             <a href="AssetList">View Assets</a>  
	</div>
        
</body>
</html>