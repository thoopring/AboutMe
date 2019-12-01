package servlet;

import java.io.IOException;
import java.util.Date;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentTimeServlet
 */
@WebServlet("/currenttime")
public class CurrentTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrentTimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    response.setContentType("text/html;charset=utf-8");
	    
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재시간</title></head>");
		out.println("<body>");

		out.println("<a href=\"index\">메인화면 </a><br>");
//		out.println("uri : " + uri + "<br>");
//		out.println("url : " + url + "<br>");
		
		LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String formatted = current.format(formatter);
        out.print("현지시간: " + formatted);

		out.println("</body>");
		out.println("</html>");
		
		
		
		
		

		out.close();
//	    PrintWriter out = response.getWriter();
//	    writer.println("");
//	    writer.println("<title>현재 시각 출력 -  Servlet</title>");
//	    writer.println("");
//	    writer.println("서블릿 생성 현재 시간: <br>");
//	                writer.println(now.toString());
//	                writer.println("");
//	                writer.close();


		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
