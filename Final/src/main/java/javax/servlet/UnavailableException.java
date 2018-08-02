package javax.servlet;

public class UnavailableException extends ServletException {
    private final int seconds;
    private final boolean permanent;

    UnavailableException(String msg){
        super(msg);
        this.seconds = 0;
        permanent = true;
    }
    public UnavailableException(String msg,int seconds){
        super(msg);
        if(seconds <= 0)
    this.seconds= -1;
        else
            this.seconds= seconds;

        permanent =false;

    }

    int getUnavailableSeconds(){
        return this.seconds;
    }
    boolean isPermanent(){

        return this.permanent;
    }
}
