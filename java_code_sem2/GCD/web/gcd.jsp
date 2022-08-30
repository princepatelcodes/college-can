<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GCD</title>
    </head>
    <body>
        <%
            int gcd = 1;
            int m1=Integer.parseInt(request.getParameter("n1"));
            int m2=Integer.parseInt(request.getParameter("n2"));
            for(int i=1; i <= m1 && i <= m2; i++){
                if(m1%i==0 && m2%i==0)
                    gcd = i;
            }
            out.println("GCD of "+m1+" and "+m2+" is "+gcd);
        %>
    </body>
</html>
