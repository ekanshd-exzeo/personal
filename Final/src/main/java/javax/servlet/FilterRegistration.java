package javax.servlet;

import java.util.Collection;
import java.util.EnumSet;


public interface FilterRegistration extends Registration {

    interface FilterRegistrationDynamic extends FilterRegistration, RegistrationDynamic {

    }

    public void addMapppingForServletNames (EnumSet<DispatcherType> dispatcherTypes,boolean isMatchAfter, String... servletnames) throws IllegalArgumentException, IllegalStateException ;
    public void addMappingForUrlPatterns(EnumSet<DispatcherType> dispatcherTypes,boolean isMatchAfter, String... UrlPatterns);
    Collection<String> getServletNameMappings ();
    Collection<String> getUrlPatternMappings();
}
