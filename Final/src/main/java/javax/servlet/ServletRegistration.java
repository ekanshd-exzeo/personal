package javax.servlet;


import java.util.Collection;
import java.util.Set;

public interface ServletRegistration extends Registration {

    interface ServletRegistrationDynamic extends ServletRegistration, Registration{
        void setLoadOnStartup(int loadOnStartup);
        void setMultipartConfig(MultiPartConfigElement multipartConfig);
        void setRunAsRole(String roleName);
        Set<String> setServletSecurity(ServletSecurityElement constraint);

    }

    Set<String> addMaping(String... urlPattern);
    Collection<String > getMappings();
    String getRunAsRole();
}