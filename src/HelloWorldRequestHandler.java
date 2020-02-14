import org.apache.solr.handler.RequestHandlerBase;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.SolrQueryResponse;

public class HelloWorldRequestHandler extends RequestHandlerBase {
  @Override
  public void handleRequestBody(SolrQueryRequest req, SolrQueryResponse rsp) throws Exception {
    rsp.add("greeting", "Hello!");
  }
  public String getDescription() {
    return "This is a custom request handler that says hello.";
  }

}