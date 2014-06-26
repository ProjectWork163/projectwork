<%-- 
    Document   : index
    Created on : Jun 25, 2014, 12:28:24 PM
    Author     : makeev_pavel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type"
              content="text/html; charset=windows-1251" />
        <title>Заказ авиабилетов</title>
    </head>
    <body>
        <c:forEach items="${someList}" var="item">
            ${item}
        </c:forEach>
        <table align="center" width="760" cellspacing="2" cellpadding="0" border="1">
            <tr>
                <td align="center" valign="middle" bgcolor="#efefef" >


                    <table align="center" width="756" cellspacing="0" cellpadding="0" border="0">
                        <tr><td align="center" height ="1"></td></tr>
                    </table>


                    <h1><font color="#2E8B57">Заказ авиабилетов</font></h1></td>
            </tr>
        </table>

        <table align="center" width="756" cellspacing="0" cellpadding="0" border="0">
            <tr><td align="center" height ="15"></td></tr></table>
        <form action="/fly" method="POST">
        <table align="center" width="760" cellspacing="2" cellpadding="26" border="1">
            <tr>
                <td align="left" valign="top" bgcolor="#efefef"><h3><font color="#2E8B57"><em>Форма заказа:</em></font></h3>
                    <font size="-1">
                    <p>
                        Самолеты - куда откуда время
                    </p>
                    <p>
                        <select name="Мета">
                            <option></option>
                            <option></option>
                        </select>
                    </p>
                    <p>Имя:
                        <input type="text" value="" size="64" />
                    </p>
                    <p>Фамилия:
                        <input type="text" value="" size="60" />
                    </p>
                    
                    <p>Паспортные данные: 
                        <input type="text" value="" size="50" />
                    </p>
                    <p>
                        <input type="submit" value="Заказать билет" />
                    </p>
                    </font>
                </td>
            </tr>
        </table>
        </form>
        <table align="center" width="756" cellspacing="0" cellpadding="0" border="0">
            <tr><td align="center" height ="15"></td></tr></table>

        <table align="center" width="760" cellspacing="2" cellpadding="0" border="1">
            <tr>
                <td align="center"  height ="40" bgcolor="#efefef"><font color="#363636" size="-2"><h1><i>Авиакомпания Makeev & Kyzyaev </i></h1></font></td>
            </tr>
        </table>

    </body>
</html>
