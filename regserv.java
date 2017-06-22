
import java.lang.ClassNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class regserv extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet regserv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet regserv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
                PrintWriter out=response.getWriter();
        
        
        String pid=request.getParameter("pid");
        String name=request.getParameter("name");
        String college=request.getParameter("college");
        String phone=request.getParameter("phone");
        String times="0";
        
       
        Connection con=null;
        Statement s=null;
        
        ResultSet rs=null;  
        
                    try {
                      String driver="net.ucanaccess.jdbc.UcanaccessDriver";
                      Class.forName(driver);
                    String path="E:/test/quizdb.accdb";
                        String url="jdbc:ucanaccess://"+path;
                        con=DriverManager.getConnection(url,"","");
                    s=con.createStatement();
              
           rs= s.executeQuery("select * from quizdb where pid='"+pid+"';");
           if(!rs.next())
           {
           s.executeUpdate("insert into quizdb (pid,names,college,phone,result,times) values('"+pid+"','"+name+"','"+college+"','"+phone+"',0,'"+times+"');");
           s.close();
           con.close();
           out.println("<body onload='window.history.go(+1);'>");
           out.println("<h1 align=center>Welcome "+name+", you are registered successfully with us !!!</h1>");
           out.println("<h1>Instructions and guidlines for the prelims</h1>");
           out.println("<h2>1. You should not refresh or close the browser at any cost. If that is the case you will be disqualified.</h2>");
           out.println("<h2>2. Within 30 minutes you have to answer the quesions. Otherwise the session will be expired.</h2>");
           out.println("<h2>3. There are no negative marks for the wrong answers.</h2>");
           out.println("<h2>4. Incase if tie happens the one who answered fast will be considered for the finals.</h2>");
           out.println("<h2>5. Contact admin only when there is a valid reason.</h2>");
           out.println("<form name='f1' action='quiz.jsp' method='post' autocomplete='off'>");
           out.println("<input type=hidden value='"+pid+"' name=pid>");
           out.println("<input type=submit value='Enter for exam' name='submit'>");
           out.println("</form>");
           out.println("</body>");
           }
           else
           {
              response.sendRedirect("index.jsp?msg=You Already Attend the Test");
           }
           }
           catch(Exception e)
           {
             out.println(e);
           }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
