package javax.servlet.http;

import javax.xml.crypto.KeySelector;
import java.io.Serializable;

public class Cookie extends Object implements Cloneable, Serializable {

    Cookie(String name, String value){ }

    public Object clone() {
        return null;
    }
    public String getComment(){
        return null;
    }

    public String getDomian(){
        return null;
    }

    public int getMaxAge(){
        return 0;
    }

    public String getName(){
        return null;
    }

    public String getPath(){
        return null;
    }

    public boolean getSecure(){

        return false;
    }

    public String getValue(){

        return null;
    }

    public int getVersion(){
        return 0;
    }

    public boolean isHttpOnly(){
        return false;
    }

    public void setComment(String purpose){ }

    public void setDomain(String domain){ }

    public void setHttpOnly(boolean isHttpOnly){ }

    public void setMaxAge (int expiry){ }

    public void setPath (String uri){ }

    public void setSecure(boolean flag){ }

    public void setValue(String newValue){ }

    public void setVersion(int v){ }



}
