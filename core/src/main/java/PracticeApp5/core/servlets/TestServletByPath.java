package PracticeApp5.core.servlets;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@SlingServlet(paths = "/bin/PracticeApp5/TestServletByPath")
public class TestServletByPath extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        resp.getOutputStream().println(resource.toString());
        resp.getOutputStream().println(
                "This content is generated by the TestServletByPath");
    }
}
