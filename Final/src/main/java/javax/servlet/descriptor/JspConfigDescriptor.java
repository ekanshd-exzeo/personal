package javax.servlet.descriptor;

import java.util.Collection;

public interface JspConfigDescriptor {
    Collection<JspConfigDescriptor> getJspPropertyGroups();

    Collection<TaglibDescriptor> getTaglibs();

}
