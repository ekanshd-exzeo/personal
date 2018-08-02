package javax.servlet.descriptor;

import java.util.Collection;

public interface JspPropertyGroupDescriptor {

    String getBuffer();
    String getDefaultcontentType();
    String getDeferredSyntexAllowedAsLiteral();
    String getElIgnored();
    String getErrorOnUnderClaredNamespace();
    Collection<String> getIncludeCodas();
    Collection<String> getIncludePrludes();
    String getIsXml();
    String getPageEncoding();
    String getScriptingInvalid();
    String getTrimDiretiveWhitespaces();
    Collection<String > gerUrlPatters();

}
