package javax.servlet.http;

public interface HttpServletMapping {

    MappingMatch getMappingMatch();
    String getMatchValue();
    String getPattern();
    String getServletName();
}
