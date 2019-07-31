<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>辅导班查询</title>
    <style>
        .button {
            BORDER-RIGHT: #000000 1px solid;
            BORDER-TOP: #f2f2f2 1px solid;
            BORDER-LEFT: #f2f2f2 1px solid;
            BORDER-BOTTOM: #000000 1px solid;
            BACKGROUND-COLOR: #a1a1a1;
            CURSOR: hand;
            COLOR: #ffffff;
            font-size:16px;
            padding: 5px 20px;
        }
    </style>
</head>

<body>
<table width="500" border="0" cellpadding="5" cellspacing="5" align="center" style="line-height:30px">
    <tr>
        <td height="50" colspan="2">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2"><div align="left"><font size="+2">2019年吉他考级乐理辅导查询</font></div></td>
    </tr>
    <tr>
        <td width="200"></td>
        <td> </td>
    </tr>
    <tr>
        <td>
            <form method="post" action="lookup">
                <p>姓名 *<br>
                    <input type="text" name="studentName">
                </p>
                <p>联系电话 *<br>
                    <input type="text" name="mobile">
                </p>
                <p>&nbsp; </p>
                <p>
                    <input type="submit" name="Submit" value="提交" class="button">
                </p>
            </form>
        </td>
        <td valign="top"><img src="images/icon.jpg" width="130" height="130"></td>
    </tr>
</table>
</body>
</html>