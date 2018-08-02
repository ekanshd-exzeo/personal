package javax.servlet;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;

import java.util.*;

public class ServletSecurityElement extends HttpConstraintElement {

    private final Map<String, HttpMethodConstraintElement> methodConstraints = new HashMap<>();

    public ServletSecurityElement() {
        super();

    }

    public ServletSecurityElement(Collection<HttpMethodConstraintElement> methodConstraints) {
        super();
        addHttpMethodConstraints(methodConstraints);
    }

    ServletSecurityElement(HttpConstraintElement constraint) {
        this(constraint, null);
    }

    ServletSecurityElement(HttpConstraintElement constraint, Collection<HttpConstraintElement> methodConstraints) {

    }

    ServletSecurityElement(ServletSecurity annotation) {
        this(new HttpConstraintElement(annotation.value().value(),
                annotation.value().transportGuarantee(),
                annotation.value().rolesAllowed()));

        List<HttpMethodConstraintElement> l = new ArrayList<>();
        HttpMethodConstraint[] constraints = annotation.httpMethodConstraints();
        if (constraints != null) {
            for (int i = 0; i < constraints.length; i++) {
                HttpMethodConstraintElement e =
                        new HttpMethodConstraintElement(constraints[i].value(),
                                (HttpMethodConstraintElement) new HttpConstraintElement(
                                        constraints[i].emptyRoleSemantic(),
                                        constraints[i].transportGuarantee(),
                                        constraints[i].rolesAllowed()));
                l.add(e);
            }
        }
        addHttpMethodConstraints(l);

    }

    Collection<HttpMethodConstraintElement> getHttpMethodConstraints() {
        Collection<HttpMethodConstraintElement> result = new HashSet<>();
        result.addAll(methodConstraints.values());
        return result;
    }

    Collection<String> getMethodNames() {
        Collection<String> result = new HashSet<>();
        result.addAll(methodConstraints.keySet());
        return result;
    }

    private void addHttpMethodConstraints(
            Collection<HttpMethodConstraintElement> httpMethodConstraints) {
        if (httpMethodConstraints == null) {
            return;
        }
        for (HttpMethodConstraintElement constraint : httpMethodConstraints) {
            String method = constraint.getMethodname();
            if (methodConstraints.containsKey(method)) {
                throw new IllegalArgumentException(
                        "Duplicate method name: " + method);
            }
            methodConstraints.put(method, constraint);
        }
    }


}
